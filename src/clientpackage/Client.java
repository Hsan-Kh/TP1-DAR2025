package clientpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Je suis un client pas encore connecté");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez une valeur à envoyer");
		int x = scanner.nextInt();
		Socket s = new Socket("localhost", 1835);
		System.out.println("Je suis un client connecté");
		DataOutputStream os = new DataOutputStream(s.getOutputStream());
        os.writeInt(x);
        System.out.println("J'envoie la valeur : " + x);
        DataInputStream is = new DataInputStream(s.getInputStream());
        int y = is.readInt();
        System.out.println("Le résultat de la multiplication est : " + y);
        is.close();
        os.close();
        s.close();
        scanner.close();
	}

}
