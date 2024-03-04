package classe;

public class Jantar {

	public static void main(String[] args) {
		
		comida c1 = new comida("Arroz", 0.150);
		comida c2 = new comida("Feijão", 0.150);
		
		pessoa p = new pessoa("Jonathas", 99.6);
	
		System.out.println(p.apresentar());
		p.comer(c1);	
		
		System.out.println(p.apresentar());
		p.comer(c2);

		System.out.println(p.apresentar());
		
	}
}
