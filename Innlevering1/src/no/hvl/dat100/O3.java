package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	public static void main(String[] args) {
		int fakultet = parseInt(showInputDialog("Skriv inn et tall: "));
		int sum = 1; 
		
		System.out.println("Resultatet av " + fakultet + "! er: ");
		
		for (int i = fakultet; i > 0; i--) {
			sum *= i;
			
			if (i > 1) {
				System.out.print(i + " * ");
			} else {
				System.out.print(i);
			}
		}
		System.out.print(" = " + sum);
	}
}
