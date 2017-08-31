package funktionen;

import java.util.Scanner;

public class Funktion {
	
	// === Relevanter Code: Beginn ===
	
	// Der Datentyp 'boolean' ist wahrscheinlich neu fuer Euch.
	// Ein Boolean kann genau zwei Werte annehmen: 'true' und 'false'.
	// Damit wird ein Bit bzw. ein Wahrheitswert repraesentiert.
	// In unserem Fall geben wir 'true' zurueck, wenn die Eingabe
	// eine Primzahl ist und 'false', wenn sie keine ist.
	public static boolean istPrim(int n) {
		int i = 2;
		while (i < n) {
			if ( (n % i) == 0 ) {
				return false;
			}
			i = i + 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);	
		
		int n;
		System.out.println("Gebe eine (positive) Zahl ein:");
		n = reader.nextInt();
		
		// Da 'istPrim(n)' ein Boolean zurueck gibt, muessen wir nicht
		// "istPrim(n) == true" schreiben. Die Schreibweise hier
		// bedeutet das Gleiche.
		if ( istPrim(n) ) {
			System.out.print("Die Zahl ");
			System.out.print(n);
			System.out.println(" ist eine Primzahl!");
		} else {
			System.out.print("Die Zahl ");
			System.out.print(n);
			System.out.println(" ist keine Primzahl.");
		}
		reader.close();
	}		
	// === Relevanter Code: Ende ===
}
