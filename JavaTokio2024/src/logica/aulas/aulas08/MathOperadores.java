package logica.aulas.aulas08;

public class MathOperadores {

	public static void main(String[] args) {
		
		double PI = Math.PI;
		System.out.println(PI);
		System.out.println(Math.sqrt(225));
		System.out.println(Math.abs(-25));
		
		double num = 3.5;
		
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		//RANDOM
		
		double random = Math.random();
		System.out.println(random);
		
		double multiplicacao = random * 5;
		System.out.println(multiplicacao);
		
		double arredonda = Math.round(multiplicacao);
		System.out.println(arredonda);
		
	}

}
