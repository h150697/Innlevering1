package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B4 {

	public static void main(String[] args) {
		double bruttoinntekt = parseInt(showInputDialog("Skriv inn bruttoinntekt: "));
		double trinnskatt = 0;
		
		System.out.println("Din bruttoinntekt er " + bruttoinntekt);

		if (bruttoinntekt <= 164100) {
			trinnskatt = 0; 
			System.out.println("Du skal betale " + trinnskatt + " i skatt.");
			
		} else if (bruttoinntekt >= 164101 && bruttoinntekt <= 230950) {
			trinnskatt = bruttoinntekt * 0.93 /100; 
			System.out.println("Du skal betale " + trinnskatt + " i skatt.");
			
		} else if (bruttoinntekt >= 230951 && bruttoinntekt <= 580650) {
			trinnskatt = bruttoinntekt * 2.41 /100; 
			System.out.println("Du skal betale " + trinnskatt + " i skatt.");
			
		} else if (bruttoinntekt >= 580651 && bruttoinntekt <= 934050) {
			trinnskatt = bruttoinntekt * 11.52 /100; 
			System.out.println("Du skal betale " + trinnskatt + " i skatt.");
			
		} else if (bruttoinntekt >= 934051) {
			trinnskatt = bruttoinntekt * 14.52 /100; 
			System.out.println("Du skal betale " + trinnskatt + " i skatt.");
			
		} else {
			System.out.println("feil");
		}
	}

}
