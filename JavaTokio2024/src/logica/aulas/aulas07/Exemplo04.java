package logica.aulas.aulas07;

import java.util.Scanner;

public class Exemplo04 {
	public static void main (String[] args) {
	Scanner SC = new Scanner(System.in);
	
	double notaA, notaB;
	
	do {
		System.out.println("Digite a primeira nota: ");
		notaA = SC.nextDouble(); 
		} while (notaA < 0 || notaA > 10);
	
	do {
		System.out.println("Digite a primeira nota: ");
		notaB = SC.nextDouble(); 
		} while (notaB < 0 || notaB > 10);
	
	double media = (notaA + notaB) / 2;
	System.out.println("A media e: " + media);
	
	SC.close();
	}
}
