package control;

import java.util.Scanner;

public class Schleifen {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===

		int n;
		
		System.out.println("Gebe eine (positive) Zahl ein:");
		n = reader.nextInt();
		
		if (n <= 0) {
			System.err.println("Die Zahl soll positiv sein!");
			// Wir benutzen 'return', um unser 
			// Programm vorzeitig abzubrechen.
			// (Ignoriert 'reader.close()'.)
			reader.close();
			return;
		}
		
		int i = 2;
		while (i < n) {
			if ( (n % i) == 0 ) {
				System.out.print("Die Zahl ");
				System.out.print(n);
				System.out.println(" ist keine Primzahl.");
				// Wir benutzen 'return', 
				// um unser Programm hier abzubrechen.
				reader.close();
				return;
			}
			i = i + 1;
		}
		System.out.print("Die Zahl ");
		System.out.print(n);
		System.out.println(" ist eine Primzahl!");
		
		// === Relevanter Code: Ende ===
		
		reader.close();
	}
}
