package serverpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server { 

	public static void main(String[] args) throws IOException {
		System.out.println("Je suis un serveur en attente la connexion d'un client ");
		ServerSocket serveur = new ServerSocket(1835);
		Socket socket = serveur.accept();
		System.out.println("Un client est connecté ");
		socket.close();


	}

}
