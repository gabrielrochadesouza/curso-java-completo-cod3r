package Arrays;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Lucas"));
		usuarios.add(new Usuario("Matheus"));
		usuarios.add(new Usuario("João"));
	
		boolean resultado = usuarios.add(new Usuario("João"));
		System.out.println(resultado);
	
	
	
	
	
	
	
	
	}
}
