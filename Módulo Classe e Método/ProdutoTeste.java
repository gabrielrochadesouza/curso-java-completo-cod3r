package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preço = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preço = 12.52;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double preçoFinaL1 = p1.preço * (1 - p1.desconto);
		double preçoFinaL2 = p1.preço * (1 - p2.desconto);
		double mediaCarrinho = (preçoFinaL1 + preçoFinaL2) / 2 ;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	} 
}
