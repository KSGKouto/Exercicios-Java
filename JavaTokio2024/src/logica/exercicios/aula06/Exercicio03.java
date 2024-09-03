package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro Bi do aluno: ");
		int bim1 = Integer.parseInt(SC.nextLine());
		System.out.println("Digite a nota do segundo Bi do aluno: ");
		int bim2 = Integer.parseInt(SC.nextLine());
		System.out.println("Digite a nota do terceiro Bi do aluno: ");
		int bim3 = Integer.parseInt(SC.nextLine());
		System.out.println("Digite a nota do quarto Bi do aluno: ");
		int bim4 = Integer.parseInt(SC.nextLine());
		
		double nota = bim1 + bim2 + bim3 + bim4;
		double media = nota / 4;
		if (media > 6) {
			System.out.println("Aluno aprovado!");
		} else if (media >= 4 && media < 6) {
			System.out.println("Aluno de recuperacao!");
		} if (media <= 3) {
			System.out.println("Aluno reprovado!");
		}
		
		SC.close();

	}

}
