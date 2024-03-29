package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra1> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra1 compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra1 compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
