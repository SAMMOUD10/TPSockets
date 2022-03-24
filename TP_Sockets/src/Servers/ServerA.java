package Servers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerA {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("J'attend la connexion...");

		Socket s = ss.accept();
		System.out.println("Connexion d'un client "+s.getRemoteSocketAddress());
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
	    /*//pour lire les chaînes de caractères envoyée par le client
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//String str = br.readLine();
		
		// pour envoyer une chaîne de caractères au client
		PrintWriter pw = new PrintWriter(os,true);
		//pw.println("Chaîne de caractères ");
		
		// Pour sérialiser un objet (envoyer un objet vers le client)
		ObjectOutputStream oos = new ObjectOutputStream(os);
		// créer un objet V1
		oos.writeObject(0);
		
		// Pour lire un objet envoyé par le client ( déserialisation )
		ObjectInputStream ois = new ObjectInputStream(is);
		// Voiture v = (Voiture)
		ois.readObject();*/
		
		System.out.println("J'attend que le client envoie un octet");
		int nb = is.read();
		System.out.println("J'ai reçu un nombre "+nb);
		int res = nb * 5;
		System.out.println("J'envoie la réponse "+res);
		os.write(res);
		s.close();
	}

}
