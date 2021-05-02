package cursoJava8.livro;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CapituloDatas {

	public static void main(String[] args) {
	
		LocalDate mesQueVem = LocalDate.now().plusMonths(1);
		
		System.out.println("Mes que vem: "+mesQueVem);
		
		LocalDate anoPassado = LocalDate.now().minusYears(1);
		System.out.println("Ano passado: " + anoPassado);
		
	//	System.out.println(LocalDate.of(2014, Month.FEBRUARY, 30));
		
		LocalDate agora = LocalDate.now();
		LocalDate outraData = LocalDate.of(2020, Month.JANUARY, 25);
		long dias = ChronoUnit.DAYS.between(outraData, agora);
		long meses = ChronoUnit.MONTHS.between(outraData, agora);
		long anos = ChronoUnit.YEARS.between(outraData, agora);
		
		System.out.printf("%s dias, %s meses e %s anos", dias, meses, anos);

		Period periodo = Period.between(outraData, agora);
		System.out.printf("\n %s dias, %s meses e %s anos", periodo.getDays(), periodo.getMonths(), periodo.getYears());
		
		LocalDateTime hAgora = LocalDateTime.now();
		LocalDateTime daquiAUmaHora = hAgora.plusHours(1);
		Duration duration = Duration.between(hAgora, daquiAUmaHora);
		if (duration.isNegative()) {
			duration = duration.negated();
		}
		System.out.printf("\n %s hora, %s minutos, %s segundos", duration.toHours(), duration.toMinutes(), duration.getSeconds());
		
	}

}
