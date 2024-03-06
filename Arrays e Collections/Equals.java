package Arrays;


public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jonathas Rocha";
		u1.email = "jonathas.rocha@ezemail.com.br";
				
		Usuario u2 = new Usuario();
		u2.nome = "Jonathas Rocha";
		u2.email = "jonathas.rocha@ezemail.com.br";	
				
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		// System.out.println(u2.equals(new Date()));
	}
}
