package oo.composicao;

public class Sistema {

	public static void main(String[] args) {
		
		
	
		Compra1 compra1 = new Compra1(); 
		compra1.adicionarItem("Caneta", 1, 90);
		compra1.adicionarItem(new Produto("Notebook", 1750.90), 2);
		
		Compra1 compra2 = new Compra1(); 
		compra2.adicionarItem("Caderno", 9, 9);
		compra2.adicionarItem(new Produto("Impressora", 858.80), 1);
		
		Cliente cliente = new Cliente("Joana Gonsalves");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}	
}
