package datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJavaAula07 {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duracao em nanossegundos: " + duracao.toNanos());
		System.out.println("Duracao em minutos: " + duracao.toMinutes());
		System.out.println("Duracao em horas: " + duracao.toHours());
		System.out.println("Duracao em milissegundos: " + duracao.toMillis());
		System.out.println("Duracao em dias: " + duracao.toDays());
	}
}
