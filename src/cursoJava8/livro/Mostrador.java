package cursoJava8.livro;

import java.util.function.Consumer;

class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario t) {
		System.out.println(t.getNome());
		
	}

}
