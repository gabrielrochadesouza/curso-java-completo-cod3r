package Desafio;

public class Carro {

	public final int Velocidade_MAXIMA;
	protected int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		Velocidade_MAXIMA = velocidadeMaxima;	
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > Velocidade_MAXIMA) {
			velocidadeAtual = Velocidade_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	public void frear() {
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