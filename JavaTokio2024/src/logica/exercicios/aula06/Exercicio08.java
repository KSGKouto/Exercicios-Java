package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite quantos Km foi percorrido: ");
		int distancia = SC.nextInt();		
		System.out.println("Digite quantos litros de gasolina foi gasto: ");
		int gasolina = SC.nextInt();
		
		int consumo = distancia / gasolina;
		
		if (consumo < 8) {
			System.out.println("Esse carro bebe ein!");
		} else {
			System.out.println("Autonomia legal!");
		}
		SC.close();
	}

}
