package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario);
		System.out.println(salarioStr);
		
		System.out.println(" ");
		
		String idade = "17";
		int idadeInteiro = Integer.parseInt(idade);
		System.out.println(idadeInteiro);
		
		System.out.println(" ");
		
		// import do Scanner
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite o preco do prouto: ");
		String preco = SC.nextLine();
		Float precoFloat = Float.parseFloat(preco);
		
		SC.close();
		
	}

}                                                                                                                                                                                                                                                                                                                        