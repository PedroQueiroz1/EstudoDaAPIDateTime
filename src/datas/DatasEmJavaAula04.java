package datas;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DatasEmJavaAula04 {

	public static void main(String[] args) throws ParseException {
		
		// Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		//Total de dias entre essa data e hoje
		//.DAYS .HOURS ETC
		long horas = ChronoUnit.HOURS.between(LocalDateTime.parse("2021-02-01T00:00:00"), LocalDateTime.now());
		
		System.out.println("Possui " + horas + " entre a faixa de data");
	}
}
