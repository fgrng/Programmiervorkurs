package inputoutput;

import java.util.Scanner;

public class HelloYou {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===
		
		System.out.println("Bitte gebe Deinen Namen ein:");		

		String eingabe;
		eingabe = reader.nextLine();
		
		System.out.print("Hallo ");
		System.out.println(eingabe);	
		
		// === Relevanter Code: Ende ===
		
		reader.close();
	}

}
