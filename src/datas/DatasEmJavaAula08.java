package datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJavaAula08 {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		LocalDate dataTeste = LocalDate.parse("2019-12-31");
		
		System.out.println(dataAntiga.isAfter(dataNova));
		System.out.println(dataAntiga.isBefore(dataNova));
		System.out.println(dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println(periodo.getDays());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
	}
}
