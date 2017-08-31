package variablen;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===
		
		String hallo;
		hallo = "Hallo ";
		
		System.out.println("Bitte gebe Deinen Namen ein:");		

		String eingabe;
		eingabe = reader.nextLine();
		
		System.out.print(hallo);
		System.out.println(eingabe);
		
		// === Relevanter Code: Ende ===
		
		reader.close();
	}
}
