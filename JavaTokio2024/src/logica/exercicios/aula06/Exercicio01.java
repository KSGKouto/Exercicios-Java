package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o numero desejado: ");
		int valor = Integer.parseInt(SC.nextLine());
		
		if (valor % 2 == 0) {
			System.out.println("Esse numero e par");
		} else {
			System.out.println("Esse numero e impar");
		}
		
		SC.close();
	}

}
