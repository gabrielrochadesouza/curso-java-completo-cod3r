package classe;

public class Produto {

	String nome;
	double preço;
	static double desconto = 0.25;
	
     Produto(){
	}
		
	
	Produto(String nomeInicial, double preçoInicial){
	nome = nomeInicial;
	preço = preçoInicial;
	// desconto = descontoInicial;
	}
			
	double precoComDesconto( ) {
		return preço * (1 - desconto);
	}
	
	
	
	double precoComDesconto(double descontoDoGerente) {
		return preço * (1 - desconto + descontoDoGerente);
			
		}
	}

