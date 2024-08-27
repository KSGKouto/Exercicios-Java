package logica.aulas.aula04;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = SC.nextLine();
		System.out.println("Olá, " + nome + "!");
		
		SC.close();
		
	}

}
