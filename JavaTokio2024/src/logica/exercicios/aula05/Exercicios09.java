package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o numero escolhido por voce:");
		int valor = Integer.parseInt(SC.nextLine());
		
		int centena = valor / 100;
		int centena1 = centena * 100;
		int dezena = valor % centena;
		int dezena1 = dezena / 100;
		int dezena10 = dezena1 / dezena;
		

	}

}
