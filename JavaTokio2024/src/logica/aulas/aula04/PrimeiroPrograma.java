package logica.aulas.aula04;

public class PrimeiroPrograma {

	public static void main(String[] args) {		
		System.out.println("Olá Mundo!");
		
		int idade;
		idade = 25;
		System.out.println(25);
		idade = 42;
		System.out.println(idade);		
		
		double salario = 1530.24;
		System.out.println(salario);
		
		String nome = "Kouto";
		System.out.println(nome);
		
		System.out.println("Bem Vindo, " + nome +"!");
		System.out.println(nome + ", voce tem " + idade + " anos!" );
		
		System.out.printf("Bem-vindo(a), %s!\n", nome);
		System.out.printf("%s, voce tem %d anos.", nome, idade);
		
	}

}
