package logica.aulas.aulas07;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		int i = 0;
		
		while (i < 5) {
			System.out.println("Ola mundo "+ i);
			i++;
		}
		*/
		/*
		String jogar = "Sim";
		
		Scanner SC = new Scanner(System.in);
		
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo.");
			System.out.println("");
			System.out.println("Deseja jogar novamente: ");
			jogar = SC.nextLine();
		}
		*/
		
		int i = 0;
		
		while (i < 10) {
			i++;
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			System.out.println("Produto" + i);
		}
	}

}
