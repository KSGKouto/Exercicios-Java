package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		//LOGICA E (&&)
		//EMAIL SENHA LOGIN
		//TRUE  TRUE  TRUE
		//FALSE  TRUE  FALSE
		//FALSE TRUE FALSE
		//FALSE FALSE FALSE
		
		boolean verificarEmail = true;
		boolean verificarSenha = true;
		
		boolean logicaE = verificarEmail && verificarSenha;
		System.out.println(logicaE);
		
		// LOGICA OU (||)
		// SOL NO DOM JOGO BR CHURRASCO
		// TRUE       TRUE    TRUE
		// TRUE       FALSE   TRUE
		// FALSE      TRUE    TRUE
		// FALSE      FALSE   FALSE
		
		boolean logicaOU = true || true;
		System.out.println(logicaOU);
		
		// OPERADOR DE NEGAÇÃO
		
		boolean negacao = !false;
		System.out.println(negacao);

	}

}
