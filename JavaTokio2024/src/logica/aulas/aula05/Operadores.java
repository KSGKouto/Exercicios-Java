package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {
		
		float num1 = 5f;
		float num2 = 2f;
		System.out.println(num1);
		System.out.println(num2);

		float soma = num1 + num2;
		System.out.println("Soma : " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("Sub : " + subtracao);
		
		float multiplicacao = num1 * num2;
		System.out.println("Multiplicacao :" + multiplicacao);
		
		float divisao = num1 / num2;
		System.out.println("Divisao :" + divisao);
		
		float resto = num1 % num2;
		System.out.println("Resto :" + resto);
	
		// OPERADORES UNÁRIOS
		
		int numero = 15;
		System.out.println("\n");
		System.out.println(numero);
		
		numero++; //numero = numero + 1
		System.out.println(numero);// 16
		System.out.println(numero++);//exibe 16 mas soma 1=>
		System.out.println(numero);//exibe 17
		System.out.println(numero);//exibe 18

		System.out.println(numero+1);//exibe 19 mas não guarda
		System.out.println(numero);//exibe 18 (ultimo valor)
		
		numero--; // numero = 18 - 1 = 17
		System.out.println(numero); // 17
		
		// OPERADORES DE ATRIBUIÇÃO
		int number = 5;
		System.out.println(" ");
		System.out.println(number);
		
		// number = number + 7
		number += 7;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
		
	}

}
