package logica.aulas.aulas08;

public class StringClasse {

	public static void main(String[] args) {
		
		String str = "FIAP PAULISTA";
		
		int tamanhoStr = str.length();
		System.out.println(tamanhoStr);
		System.out.println(str.charAt(6));
		
		for (int i = 0; i < 13; i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
