package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
	
	Compra compra1 = new Compra();
	compra1.cliente= "Miguel soarez";
	
	compra1.adicionarItem(new Item("caneta", 20, 7.45));
	compra1.adicionarItem(new Item("Apontador", 5, 3.50));
	compra1.adicionarItem(new Item("Caderno", 3, 19.99));	
	
	System.out.println(compra1.itens.size());
	System.out.println(compra1.obterValorTotal());
	
	// só pra mostrar a relação bidirecional!!!
	double total = compra1.itens.get(0).compra
			.itens.get(1).compra.obterValorTotal();
	System.out.println("O total é R$" + total);
	
	}
}