package cursoJava8.livro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo4 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo silveira", 150);
		Usuario user2 = new Usuario("Rodrigo turini", 120);
		Usuario user3 = new Usuario("Guilherme silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		
		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
		
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		
		//usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		//usuarios.removeIf(u -> u.getPontos() > 160);
		
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
	}
	
	Comparator<Usuario> comparator = new Comparator<Usuario>() {

		
		public int compare(Usuario o1, Usuario o2) {
			
			return o1.getNome().compareTo(o2.getNome());
			
			
		}
		
	
	};
	
	

}
