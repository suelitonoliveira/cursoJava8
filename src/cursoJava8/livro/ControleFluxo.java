package cursoJava8.livro;

public class ControleFluxo {

	public static void main(String[] args) {
		
		int idade = 20;
		String status;
		/*
		 * if (idade < 10) { status = "Não adulto"; }else { status = "Adulto"; }
		 */
		//operador ternario
		status = idade < 10 ? "Não adulto" : "Adulto";
		System.out.println(status);

	}

}
