package logica.aulas.aulas07;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = SC.nextInt();
		System.out.println(n +" X 1 =" + (n * 1));
		System.out.println(n +" X 2 =" + (n * 2));
		System.out.println(n +" X 3 =" + (n * 3));
		System.out.println(n +" X 4 =" + (n * 4));
		System.out.println(n +" X 3 =" + (n * 5));
		
		SC.close();
	}

}
