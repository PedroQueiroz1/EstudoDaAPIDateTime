package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJavaAula03 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); // Pega a data atual		
		
		//Definindo data qualquer
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5); // Data de hoje + 5 dias
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	
		calendar.add(Calendar.MONTH, 1); // Somando 1 mês
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
