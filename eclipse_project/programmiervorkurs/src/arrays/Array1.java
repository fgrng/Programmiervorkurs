package arrays;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 

		// === Relevanter Code: Beginn ===
		
		int[] einarray;
		einarray = new int[100];
		
		int i = 0;
		while ( i < 100 ) {
			// Erzeuge Zufallszahl zwischen 0 und 49.
			einarray[i] = rand.nextInt(50);
			i = i + 1;
		}
		
		System.out.print("An Index 0 steht ");
		System.out.println(einarray[0]);
		
		System.out.print("An Index 42 steht ");
		System.out.println(einarray[42]);
		
		System.out.print("An Index 99 steht ");
		System.out.println(einarray[99]);
		
		// === Relevanter Code: Ende ===
	}
}