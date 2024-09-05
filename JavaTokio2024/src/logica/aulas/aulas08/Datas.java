package logica.aulas.aulas08;

import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {
		Calendar C = Calendar.getInstance();
		
		System.out.println(C.getTime());
		
		System.out.println("Ano: " + C.get(Calendar.YEAR));
		System.out.println("Mes: " + C.get(Calendar.MONTH));
		System.out.println("Dia do mes: " + C.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + C.get(Calendar.DAY_OF_WEEK));
		
	}

}
