package debugging;

import java.util.Scanner;

public class Debugger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===

		int a, b, c;
		
		System.out.println("Gebe eine Zahl ein:");
		a = reader.nextInt();
		
		System.out.println("Gebe eine weitere Zahl ein:");
		b = reader.nextInt();
		
		c = a + b;
		a = b / c;
		c = 2 * a + b;
		
		System.out.print("c ist jetzt ");
		System.out.println(c);
		
		// === Relevanter Code: Ende ===
		
		reader.close();
	}
}
