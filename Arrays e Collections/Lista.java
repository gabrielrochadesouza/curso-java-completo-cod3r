package Arrays;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> Lista = new ArrayList<>();
	
		Usuario u1 = new Usuario("Gedeão");
		Lista.add(u1);
		
		Lista.add(new Usuario("Igor"));
		Lista.add(new Usuario("Henrique"));
		Lista.add(new Usuario("Jonathas"));
		Lista.add(new Usuario("Gabriel"));
		Lista.add(new Usuario("Ivone"));
		
		System.out.println(Lista.get(3).nome); // acessar pelo índice
		
		System.out.println(">>> " + Lista.remove(1));
		System.out.println(Lista.remove(new Usuario("Gabriel")));
		
		System.out.println("tem " + Lista.contains(new Usuario("Gabriel")));
		System.out.println("tem " + Lista.contains(u1));
		
		for(Usuario u: Lista) {
			System.out.println(u.nome);
		
		
		
		}
	}
}
