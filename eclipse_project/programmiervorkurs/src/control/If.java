package control;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===

		int a, b;
		
		System.out.println("Gebe eine Zahl ein:");
		a = reader.nextInt();
		
		System.out.println("Gebe eine weitere Zahl ein:");
		b = reader.nextInt();
		
		if (b == 0) {
			// System.err ist eine weitere Moeglichkeit 
			// der Ausgabe, die fuer Fehler verwendet wird. 
			// Ihr seht dies genauso wie den Output 
			// von System.out auf der Konsole, aber man 
			// kann diesen Output besonders behandeln.
			// (Eclipse faerbt ihn etwa rot.)
			System.err.println("Die zweite Zahl darf nicht 0 sein!");
		} else {
			System.out.print("Ihr Quotient ist ");
			System.out.print( a / b);
		}
		
		// === Relevanter Code: Ende ===
		
		reader.close();

	}

}
