package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int A = 5;
		int B = 7;
		int C = 4;
		int D = 8;
		
		boolean verificaA = (A <= B && B < D);
		System.out.println(verificaA);
		
		boolean verificaB = (A == B && C != B);
		System.out.println(verificaB);
		
		boolean verificaC = (D > A && C >= B);
		System.out.println(verificaC);
		
		boolean verificaD = (A <= B && C <= D);
		System.out.println(verificaD);
		
		boolean verificaE = (B > C && C < A && D < B);
		System.out.println(verificaE);

	}

}
