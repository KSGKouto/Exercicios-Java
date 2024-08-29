package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite o nome da peca que deseja comprar:");
		String nomepeca = SC.nextLine();
		System.out.println("Digite a quantidade que deseja comprar de: " + nomepeca);
		String quantidade = SC.nextLine();
		System.out.println("Digite o valor de cada: " + nomepeca );
		String valor = SC.nextLine();
		float quantidadepeca = Float.parseFloat(quantidade);
		float Valorpeca = Float.parseFloat(valor);
		double multi = quantidadepeca * Valorpeca;
		System.out.println("Valor da primeira peca: " + multi);
		
		System.out.println("                          ");
		
		System.out.println("Digite o nome da segunda peca que deseja comprar: ");
		String nomepeca2 = SC.nextLine();
		System.out.println("Digite a quantidade que deseja comprar de " + nomepeca2);
		String quantidade2 = SC.nextLine();
		System.out.println("Digite o valor de cada " + nomepeca2 );
		String valorPeca = SC.nextLine();
		float quantidadepeca2 = Float.parseFloat(quantidade2);
		float ValorPeca = Float.parseFloat(valorPeca);
		double multi2 = ValorPeca * quantidadepeca2;
		System.out.println("O Valor da " + nomepeca2 + "e igual a " + multi2 + "!" );
		double total = multi2 + multi;
		System.out.println("VALOR TOTAL = R$" + total);
		SC.close();
		

	}

}
