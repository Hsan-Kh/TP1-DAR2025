package serverpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server { 

	public static void main(String[] args) throws IOException {
		System.out.println("Je suis un serveur en attente la connexion d'un client ");
		ServerSocket serveur = new ServerSocket(1835);
		Socket socket = serveur.accept();
		System.out.println("Un client est connecté ");
        DataInputStream in = new DataInputStream(socket.getInputStream());
        int x = in.readInt();
        System.out.println("Le client a envoyé la valeur : " + x);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(x * 2);
        System.out.println("Le serveur fait la multiplication");
        in.close();
        out.close();
        socket.close();
        serveur.close();


	}

}
