package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num1 = Integer.parseInt(SC.nextLine());
		System.out.println("Digite mais um numero: ");
		int num2 = Integer.parseInt(SC.nextLine());
		
		if (num1 > num2) {
			System.out.println("O numero e maior.");
		} else if (num1 < num2) {
			System.out.println("O numero e menor");
		} else {
			System.out.println("Esse numero e igual.");
		}
		SC.close();
	}

}
