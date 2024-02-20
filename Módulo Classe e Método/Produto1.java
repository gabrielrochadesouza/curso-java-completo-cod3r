package classe;

public class Produto1 {

	String nome;
	double preço;
	double desconto;
	
	double precoComDesconto() {
	return preço * (1 - desconto);
	
	
	
	}
}
