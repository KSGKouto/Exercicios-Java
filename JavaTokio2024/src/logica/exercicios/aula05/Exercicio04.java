package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno:");
		String nota1 = SC.nextLine();
		
		System.out.println("Digite a segunda nota do aluno:");
		String nota2 = SC.nextLine();
		
		float nota = Float.parseFloat(nota1);
		float note = Float.parseFloat(nota2);
		
		float soma = nota + note;
		float divisao = soma / 2;
		System.out.println("Nota do aluno:" + divisao);
		SC.close();
	}

}
