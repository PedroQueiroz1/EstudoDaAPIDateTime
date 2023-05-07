package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJavaAula06 {

	public static void main(String[] args) {
		
		/*
		 * Nova API de data a partir do Java 8
		 */
		LocalDate dataAtual = LocalDate.now();
		LocalTime horaAtual = LocalTime.now();		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));		
		System.out.println("Data e hora atual: " + dataAtualHoraAtual);
		
		System.out.println(
				"Data e hora atual: " 
						+ dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE));
		System.out.println(
				"Data e hora atual: " 
						+ dataAtualHoraAtual.format(DateTimeFormatter
								.ofPattern("dd/MM/yyyy HH:mm")));
		
		/*
		 * Dias meses anos e semanas
		 */
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getYear());
	}
}
