package arithmetik;

import java.util.Scanner;

public class Arith3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// === Relevanter Code: Beginn ===
		
		System.out.println("Gebe eine Zahl ein:");
		int a;
		a = reader.nextInt();
		
		System.out.println("Gebe eine weitere Zahl ein:");
		int b;
		b = reader.nextInt();
		
		System.out.print("Ihre Summe ist ");
		System.out.println(a + b);
		
		// === Relevanter Code: Ende ===
		
		reader.close();
	}
}
