package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		String novamente = "Sim";
		
		while (novamente.equals("Sim")) {
			System.out.println("Ola Mundo!");
			System.out.println("");
			System.out.println("Deseja exibir novamente: ");
			novamente = SC.nextLine();
		}
	}

}
