package classe;

public class Produto {

	String nome;
	double preço;
	double desconto;
	
     Produto(){
	}
		
	
	Produto(String nomeInicial, double preçoInicial, double descontoInicial){
		nome = nomeInicial;
	preço = preçoInicial;
	desconto = descontoInicial;
	}
			
	double precoComDesconto( ) {
		return preço * (1 - desconto);
	}
	
	
	
	double precoComDesconto(double descontoDoGerente) {
		return preço * (1 - desconto + descontoDoGerente);
			
		}
	}

