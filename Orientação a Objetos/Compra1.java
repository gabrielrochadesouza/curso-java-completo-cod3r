package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra1 {

	final List<Item1> itens = new ArrayList<>();

	void adicionarItem (Produto p, int qtde) {
		this.itens.add(new Item1(p,qtde));
	}

	void adicionarItem (String nome, double preço, int qtde) {
		var produto = new Produto(nome,preço);
		this.itens.add(new Item1(produto, qtde));
	
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item1 item1: itens) {
			total += item1.quantidade * item1.produto.preço;
		}
		
		return total;
		
	}
}
