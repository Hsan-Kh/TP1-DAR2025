package clientpackage;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            InetAddress serverAddress = InetAddress.getByName("192.168.x.x");// Remplacer "192.168.x.x" par l'adresse IP réelle du serveur si le client est sur une autre machine
            int port = 1835;

            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connecté au serveur : " + serverAddress.getHostAddress());

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            Scanner sc = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n--- Calculatrice ---");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Quitter");
                System.out.print("Choisissez une option : ");
                String choix = sc.next();

                if (choix.equals("5")) {
                    out.writeUTF("exit");
                    running = false;
                    break;
                }

                System.out.print("Entrez le premier nombre : ");
                double a = sc.nextDouble();
                System.out.print("Entrez le second nombre : ");
                double b = sc.nextDouble();

                out.writeUTF(choix);
                out.writeDouble(a);
                out.writeDouble(b);

                String response = in.readUTF();
                System.out.println("=> " + response);
            }

            sc.close();
            in.close();
            out.close();
            socket.close();
            System.out.println("Client déconnecté.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
