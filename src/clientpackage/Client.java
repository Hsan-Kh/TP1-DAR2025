package clientpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Je suis un client pas encore connecté");
		Socket s = new Socket("localhost", 1835);
		System.out.println("Je suis un client connecté");
		s.close();
	}

}
