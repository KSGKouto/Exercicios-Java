package logica.aulas.aulas06;

public class VotoOpicional {

	public static void main(String[] args) {
		
		int idade = 15;
		
		boolean verificaMenorIdade = idade >= 16 && idade < 18;	
		System.out.println("Voto opc menor idade: " + verificaMenorIdade);
		boolean verificaVeinho = idade > 70;
		System.out.println("Voto opc maior de idade: " + verificaVeinho);

		if (verificaMenorIdade || verificaVeinho) {
			System.out.println("Voto opicional.");
		}
		
		if ((idade >= 16 && idade < 18) || idade > 18) {
			System.out.println("Voto opicional");
		}
	}

}
