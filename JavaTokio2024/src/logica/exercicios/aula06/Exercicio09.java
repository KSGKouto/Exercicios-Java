package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Digite quantos KW/h foi gasto por voce no mes: ");
		int gastoM = SC.nextInt();
		System.out.println("Selecione o local que foi gasto a energia: \nResidencia \nComercio \nIndustria");
		String local = SC.next();
		
		switch (local) {
		case "Residencia":
			System.out.println(gastoM * 0.60);
			break;
		case "Comercio":
			System.out.println(gastoM * 0.48);
			break;
		case "Industria":
			System.out.println(gastoM * 1.29);
			break;
		} 
		SC.close();
		}
	
	}
