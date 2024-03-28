package Desafio;

public class Limusine extends Carro  implements Esportivo, Luxo {

	private boolean	ligarTurbo = false ;
	private boolean ligarAr = false;
	
	
	public Limusine() {
		this(315);
	}
	
	public Limusine(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(12);
	}
	
	@Override
	public void ligarTurbo() {	
		ligarTurbo = true;
	}
 
	@Override
	public void desligarTudo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
		return  32; 
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && ligarAr) {
			return 20;
		} else {
			return 16;
		}
		
	}
	// @Override
	// public void acelerar() {
		// super.acelerar();
		// }

}
