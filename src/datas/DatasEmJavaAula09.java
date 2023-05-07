package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJavaAula09 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-12-31");
		
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: " +(dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 4 meses: " + (dataBase = dataBase.plusMonths(4)));
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		
		
		/*
		 * Brincando com boletos
		 */
		
		LocalDate dataBoleto = LocalDate.parse("2019-10-05");
		
		for(int mes = 1; mes <=12; mes ++) {
			dataBoleto = dataBoleto.plusMonths(1);
			
			System.out.println("Data de vencimento do boleto: " 
			+ dataBoleto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
			+ " do mês " + mes);
		}
	}
}
