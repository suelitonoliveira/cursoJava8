package cursoJava8.capitulo2;

public class ControleFluxoSwitch {

	public static void main(String[] args) {

		byte dia = 5;
		// char, int , byte, short, enum e String pode ir dentro do switch
		switch (dia) {
		case 1:

			System.out.println("Domingo");
			break;
		case 2:

			System.out.println("Segunda");
			break;
		case 3:

			System.out.println("Ter�a");
			break;
		case 4:

			System.out.println("Quarta");
			break;

		case 5:

			System.out.println("Quinta");

			break; // quando encontra sai do bloco de c�digo

		case 6:

			System.out.println("Sexta");
			break;

		case 7:

			System.out.println("Sabado");
			break;

		}
		
		char sexo = 'M';
		switch (sexo) {
		case 'F':
			System.out.println("feminino");
			break;
		case 'M':
			System.out.println("Masculino");
		default:
			break;
		}

	}
}
