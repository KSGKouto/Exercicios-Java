package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicios03 {
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = SC.nextLine();
		System.out.println("Ola, " + nome + "!");
		SC.close();
	}
}
