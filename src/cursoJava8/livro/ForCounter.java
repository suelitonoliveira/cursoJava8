package cursoJava8.livro;

public class ForCounter {

	public static void main(String[] args) {
		
		for (int counter = 1; counter <= 10; counter++) {
			System.out.printf("%d ", counter);
			System.out.println();
		}
		
		/*instru��o while equivalente
		 * inicializa��o; while (condi��oDeContinua��oDoLoop) { instru��o incremento; }
		 */
		
		//express�es aritm�ticas
		
		int total = 0;
		//total de inteiros paras de 2 a 20
		for (int number = 2; number <= 20; number+=2) {
			total += number;
			
			System.out.printf("Sum is %d%n", total);
		}
		
	}

}
