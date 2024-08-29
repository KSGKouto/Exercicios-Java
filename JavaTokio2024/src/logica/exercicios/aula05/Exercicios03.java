package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios03 {
	public static void main(String[] args) {
		
		Scanner X = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = X.nextLine();
		System.out.println(nome + "Digite seu genero: [M] Masculino, [F] Feminino, [O] Outro, [N] Prefiro não responder");
		char genero = X.nextLine().charAt(0); 
		System.out.println("Ola, " + nome + "! Voce escolheu  a seguinte opcao de genero: " + genero);
		X.close();
	}

}
