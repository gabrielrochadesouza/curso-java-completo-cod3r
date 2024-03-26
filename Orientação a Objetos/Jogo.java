package oo.herança;

public class Jogo {

	public static void main(String[] args) {
	
		Monstro monstro = new Monstro();
		monstro.x = 20;
		monstro.y = 20;
		
		Heroi heroi = new Heroi(10, 11);
	
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcão.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}	
}
