package logica.aulas.aulas07;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		int numero, soma = 0;
		System.out.println("Digite um numero: ");
		numero = SC.nextInt();
		soma = soma + numero;
		System.out.println("Variavel soma agora: " + soma);

		System.out.println("Digite um numero: ");
		numero = SC.nextInt();
		soma += numero;
		System.out.println("Variavel soma agor: " + soma);

		System.out.println("Digite um numero: ");
		numero = SC.nextInt();
		soma += numero;
		
		System.out.println("A some e: " + soma);
		SC.close();
	}

}
