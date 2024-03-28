package Polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.55);
	
		
		Arroz ingrediente1 = new Arroz(0.20);
		Feijão ingrediente2 = new Feijão(0.19);
		Comida ingrediente3 = new Arroz(0.3);
	
		System.out.println(convidado.getPeso());
	
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
		
	
	
	}
}
