package Pratica1;

public class Exercício2 {

	public static void main(String[] args) {
		
		String s = "Bom dia";
		s = s.replace("x", "Igor");
		s = s.toUpperCase();
		s = s.concat("!!!");
	
		System.out.println(s);
		
		String x = "Igor".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace
				("X", "Igor")
				.toUpperCase().concat("!!!");
		
		System.out.println(y);
	}
}
