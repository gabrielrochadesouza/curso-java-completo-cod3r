package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> Livros = new ArrayDeque<String>();
		
		Livros.add("Assasins'creed");
		Livros.push("Habitos");
		Livros.push("Mente blindada");
	
		System.out.println(Livros.peek());
		System.out.println(Livros.element());
		
		System.out.println(Livros.pop());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.pop());
		System.out.println(Livros.pop());
		System.out.println(Livros.pop());		
		// System.out.println(Livros.remove());

		// Livros.size();
		// Livros.clear();
		// Livros.contains();
		// Livros.isEmpty();
		
		
	
	
	}
}
