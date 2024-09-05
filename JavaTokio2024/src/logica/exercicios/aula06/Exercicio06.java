package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o ano que vc nasceu: ");
		int ano = SC.nextInt();
		double idade = 2024 - ano;
		System.out.println("Sua idade e " + idade);
		
		if (idade >= 17 && idade <= 18) {
			System.out.println("Voto opicional");
		} else if (idade > 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else if (idade < 17) {
			System.out.println("Voto proibido");
		}
		
		SC.close();
	}

}
