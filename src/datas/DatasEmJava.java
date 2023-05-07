package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		Date data = new Date();
		
		System.out.println("Data em milissegundos " + data.getTime());
		System.out.println("Dia do mês " + data.getDate());
		System.out.println("Dia da semana " + data.getDay());
		System.out.println("Horas do dia " + data.getHours());
		System.out.println("Minutos " + data.getMinutes());
		System.out.println("Mês " + data.getMonth());
		System.out.println("Segundos " + data.getSeconds());
		System.out.println("Ano " + (data.getYear() + 1900));
		
		
		/*------------ SIMPLE DATE FORMAT -----------------*/
		
		// Formatação para banco de dados
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		//Formatação para mostrar na tela
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		
		System.out.println("Data atual em formato padrão e String " + simpleDateFormat2.format(data));
		
		System.out.println("Data atual em formato para banco de dados e String " + simpleDateFormat.format(data));
	
        try {
            Date parsedDate = simpleDateFormat2.parse("31/12/1990 21:44:44");
            System.out.println("Objeto Data: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Erro ao analisar a data: " + e.getMessage());
        }
        
        /*
         * CALENDAR 
         */
        System.out.println("Calendar em milissegundos " + calendar.getTimeInMillis());
        System.out.println("Calendar dia do mês " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar dia da semana " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar horas do dia " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Calendar minutos " + calendar.get(Calendar.MINUTE));
        System.out.println("Calendar segundos " + calendar.get(Calendar.SECOND));
        System.out.println("Calendar ano " + calendar.get(Calendar.YEAR));
        
        System.out.println("Data atual em formato padrão e String " 
        		+ simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("Data atual em formato para banco de dados e String " + simpleDateFormat.format(data));
	
	}
	
}
