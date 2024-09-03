package logica.aulas.aulas06;

public class condicionais {

	public static void main(String[] args) {
		// -----------------------------
		// ESTRUTURA CONDICIONAL SIMPLES
		// -----------------------------

		/*
		 * float nota = 7;
		 * 
		 * if (nota < 6) { System.out.println("Sua nota é: " + nota); }
		 * 
		 * System.out.println("FIM");
		 */

		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------
		
		/*
		float notafinal = 10;
		
		if(notafinal < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		System.out.println("FIM");
		*/

		// -------------------------------
		// ESTRUTURA CONDICIONAL ENCADIADA
		// -------------------------------
		
		/*
		float notafinal = 3;
		if (notafinal < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Vamos verificar...");
			}
			if (notafinal  < 6) {
				System.out.println("Recuperacao");
			} else {
				System.out.println("Aprovado"); 
			}
			*/
		
		// ---------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA V2
		// ---------------------------------
				
		float notafinal = 10;
		if (notafinal < 4) {
			System.out.println("Reprovado");
		} else if (notafinal < 6) { 
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
	}
			
	}