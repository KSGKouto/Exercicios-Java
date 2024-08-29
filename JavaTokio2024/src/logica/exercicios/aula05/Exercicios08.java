package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios08 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		////////////////////////////////////
		// Escolha da moeda
		System.out.println("Digite o valor que voce deseja converter seu dinheiro:");
		double valor = Double.parseDouble(SC.nextLine());
		double Dolar = valor * 0.18;
		double Euro = valor * 0.16;
		double PesoArgentino = valor * 168.99;
		double LibraEsterliana = valor * 0.14;
		double Iene = valor * 25.77;
		
		//Calculo de cada moeda
		System.out.println("O valor de cada moeda e: \nDolar: " + Dolar + "\nEuro: " + Euro + "\nPeso Argentino: "+ PesoArgentino + "\nLiba Esterliana: " + LibraEsterliana + "\nIene: " + Iene);
		SC.close();

	}

}
