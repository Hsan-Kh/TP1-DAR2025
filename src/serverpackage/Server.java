package serverpackage;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            InetAddress serverAddress = InetAddress.getLocalHost();
            int port = 1835;

            System.out.println("Adresse du serveur : " + serverAddress.getHostAddress());
            System.out.println("Serveur en attente de connexion...");

            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(serverAddress, port));

            Socket socket = serverSocket.accept();
            System.out.println("Client connecté depuis " + socket.getInetAddress().getHostAddress());

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            boolean running = true;
            while (running) {
                String operation = in.readUTF();
                if (operation.equalsIgnoreCase("exit")) {
                    running = false;
                    break;
                }

                double a = in.readDouble();
                double b = in.readDouble();
                double result = 0;

                switch (operation) {
                    case "1": result = a + b; break;
                    case "2": result = a - b; break;
                    case "3": result = a * b; break;
                    case "4":
                        if (b != 0)
                            result = a / b;
                        else {
                            out.writeUTF("Erreur : Division par zéro !");
                            continue;
                        }
                        break;
                    default:
                        out.writeUTF("Opération invalide !");
                        continue;
                }

                out.writeUTF("Résultat = " + result);
            }

            System.out.println("Fermeture du serveur...");
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
