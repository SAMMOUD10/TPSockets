package Clients;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientA {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Je me connecte au serveur");
		Socket socket = new Socket("localhost",2000);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		/*
		 * Saisir un nombre au clavier
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer un nombre: ");
		int nb = scanner.nextInt();
		
		System.out.println("J'envoie le nombre "+nb+" au serveur");
		os.write(nb);
		System.out.println("J'attend la réponse");
		int rep = is.read();
		System.out.println("La réponse du serveur est "+rep);
		
	}

}
