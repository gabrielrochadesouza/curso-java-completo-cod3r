package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "João");
		usuarios.put(2, "Indío");	
		usuarios.put(3, "Renam");	
		usuarios.put(4, "Miguel");	
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Miguel"));
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "emersom"));

		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);	
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
		System.out.println(registro.getKey() + " ==> ");
		System.out.println(registro.getValue());
		
		}
	}
}
