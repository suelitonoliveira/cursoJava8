package cursoJava8.livro;

import java.time.LocalDate;

public class CapituloDatas {

	public static void main(String[] args) {
	
		LocalDate mesQueVem = LocalDate.now().plusMonths(1);
		
		System.out.println("Mes que vem: "+mesQueVem);
		
		LocalDate anoPassado = LocalDate.now().minusYears(1);
		System.out.println("Ano passado: " + anoPassado);

	}

}
