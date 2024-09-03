package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		int valorA = Integer.parseInt(SC.nextLine());
		System.out.println("Digite o valor B: ");
		int valorB = Integer.parseInt(SC.nextLine());
		double Divi = valorA % valorB;
		
		if (Divi == 0) {
			System.out.println("Os numeros sao multiplos.");
		} else if (Divi >= 1) {
			System.out.println("Os numeros nao sao multiplos");
		}
		
		SC.close();
		
		
	}

}
