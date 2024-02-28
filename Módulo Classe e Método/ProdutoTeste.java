package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preço = 12.52;
		
		Produto.desconto = 0.60;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double preçoFinaL1 = p1.precoComDesconto(0);
		double preçoFinaL2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (preçoFinaL1 + preçoFinaL2) / 2 ;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	} 
}
