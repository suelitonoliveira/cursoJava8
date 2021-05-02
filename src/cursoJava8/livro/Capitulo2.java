package cursoJava8.livro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		/*
		 * for (Usuario u : usuarios) { System.out.println(u.getNome()); }
		 */
		/*
		 * Consumer<Usuario> mostrador = new Consumer<Usuario>() {
		 * 
		 * @Override public void accept(Usuario t) { System.out.println(t.getNome());
		 * 
		 * }
		 * 
		 * }; usuarios.forEach(mostrador);
		 */
		/*
		 * tradicional usuarios.forEach(new Consumer<Usuario>() {
		 * 
		 * @Override public void accept(Usuario t) { System.out.println(t.getNome());
		 * 
		 * } });
		 */

		/*
		 * // lambda
		 * 
		 * Consumer<Usuario> mostrador = (Usuario u) -> System.out.println(u.getNome());
		 * 
		 * usuarios.forEach(mostrador);
		 */
		
		//lambda mais usada
		usuarios.forEach(u -> System.out.println(u.getNome()));
		usuarios.forEach(u -> u.tornaModerador());

	}

}
