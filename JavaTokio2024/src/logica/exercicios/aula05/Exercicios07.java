package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios07 {
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua compra:");
		String total = SC.nextLine();
		float totalC = Float.parseFloat(total);
		
		System.out.println("Digite a quantidade que vc usou pra pagar:");
		String quantidadetroco = SC.nextLine();
		float dinheiro = Float.parseFloat(quantidadetroco);
		
		double totalCompra = totalC - dinheiro;
		System.out.println("VALOR TOTAL DO TROCO: R$" + totalCompra);
		SC.close();
	}
}
