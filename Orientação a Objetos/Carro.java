package Desafio;

public class Carro {

	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;
	
	
	
	}
	void frear() {
		if(velocidadeAtual >= 5) {		
		velocidadeAtual -= 5;
	} else {
		velocidadeAtual = 0;	
	  }
     }
	public String toString() {
		return "Velociade Atual é " + velocidadeAtual + "Km/h." ;
	}
} 