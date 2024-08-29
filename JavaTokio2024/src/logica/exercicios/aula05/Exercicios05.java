package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Os pesos de cada bimestre: 1Bi 40% 2Bi 60%");
		
		System.out.println("Vamos calcular a media do aluno, digite a nota do 1Bi:");
		String nota1 = SC.nextLine();
		
		System.out.println("Vamos calcular a media do aluno, digite a nota do 2Bi:");
		String nota2 = SC.nextLine();
		
		float note = Float.parseFloat(nota1);
		float note2 = Float.parseFloat(nota2);
		
		double multinota1 = note * 0.4;
		double multinota2 = note2 * 0.6;
		double soma = multinota1 + multinota2;
		System.out.println("A nota do aluno e:" + soma);
		
		SC.close();

	}

}
