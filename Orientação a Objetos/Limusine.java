package Desafio;

public class Limusine extends Carro {

	public Limusine() {
		this(315);
	}
	
	public Limusine(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 355;
	}
	
 // @Override
	// public void acelerar() {
		// super.acelerar();
		// }

}
