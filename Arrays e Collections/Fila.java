package Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		
		// Diferença é o comportamento
		// quando a fila ta cheia!
		fila.add("João"); // retorna false (falso)
		fila.offer("Bele"); // lança uma exceção	
		fila.add("Thiago");
		fila.offer("cleide");
		fila.add("Talita");
		fila.offer("Heliton");
	
		// peek e Element -> obter próximo elementos
		// da fila(sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		// pool  e Remove -> obter próximo elemento
		// da fila e remove!
		
		// Diferença é o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.poll()); // retorna null 
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	
				
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}
}
