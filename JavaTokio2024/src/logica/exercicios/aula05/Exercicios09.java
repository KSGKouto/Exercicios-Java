package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o numero escolhido por voce:");
		String valor = SC.nextLine();
		int numeroInt = Integer.parseInt(valor);
		
		
		int centena = (int) (numeroInt / 100f);
		int centena1 = (int) (centena * 100f);
		int dezena = (int) (numeroInt % centena1);
		int dezena1 = (int) (dezena / 10f);
		int dezena10 = (int) (dezena1 / 10f);
		int unidade = (int) (dezena % dezena10);
		
		System.out.println("Centena: " + centena1
										+ "\nDezena: " + dezena10
										+ "\nUnidade: " + unidade);
		
	}

}
