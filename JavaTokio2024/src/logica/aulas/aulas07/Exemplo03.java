package logica.aulas.aulas07;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
	
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a n: ");
		int n = SC.nextInt();
		
		int i = 0;
		
		while (i < n) {
			System.out.println("Produto: " + i);
			i++;
		}

	}

}
