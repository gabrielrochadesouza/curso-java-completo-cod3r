package Fundamentos;

public class NotaçaoPonto {


	public static void main (String[] args ) {
	
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");	
		s = s.toUpperCase(); // s.toU + ctrl + espaço
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		}
}
