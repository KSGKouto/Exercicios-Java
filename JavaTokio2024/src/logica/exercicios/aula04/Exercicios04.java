package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Qual sua idade:");
		String idade = SC.nextLine();
		System.out.println("Qual seu nome");
		String nome = SC.nextLine();
		System.out.println("Olá, " + nome +". Voce tem " + idade + " anos!");
		
		SC.close();
	}

}
