package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num1 = Integer.parseInt(SC.nextLine());
		System.out.println("Digite o numero 2:");
		int num2 = Integer.parseInt(SC.nextLine());
		System.out.println("Escolha o operador da conta \n+" + "\n-" + "\n*" + "\n/");
		char operador = SC.nextLine().charAt(0);
		
		switch (operador) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		}

	}

}
