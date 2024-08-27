package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o seu salario:");
		String salario = SC.nextLine();
		System.out.println("Olá, seu salario é" + salario +"!");
		
		SC.close();
	}

}
