package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B5 {

	public static void main(String[] args) {
		final int STUDENTER = 10;
		
		for(int input = 1; input <= STUDENTER; input++) {
			
			int poeng = parseInt(showInputDialog("Skriv inn antall poeng: "));
			String karakter = "";
			
			if (poeng <= 100 && poeng >= 90) {
				karakter = "A";
				System.out.println("Din karakter er " + karakter);
			} else if (poeng <= 89 && poeng >= 80) {
				karakter = "B";
				System.out.println("Din karakter er " + karakter);
			} else if (poeng <= 79 && poeng >= 60) {
				karakter = "C";
				System.out.println("Din karakter er " + karakter);
			} else if (poeng <= 59 && poeng >=50) {
				karakter = "D";
				System.out.println("Din karakter er " + karakter);
			} else if (poeng <= 49 && poeng >= 40) {
				karakter = "E";
				System.out.println("Din karakter er " + karakter);
			} else if (poeng <= 39 && poeng >= 0) {
				karakter = "F";
				System.out.println("Din karakter er " + karakter);
			} else {
				showMessageDialog(null,"Du har tastet inn en ugyldig poengsum, prøv igjen.");
				input--;
			}
			
		}
	}
}
