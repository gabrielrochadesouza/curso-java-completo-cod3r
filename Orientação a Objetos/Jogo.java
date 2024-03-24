package oo.herança;

public class Jogo {

	public static void main(String[] args) {
	
		Monstro j1 = new Monstro();
		j1.x = 20;
		j1.y = 20;
		
		Heroi j2 = new Heroi();
		j2.x = 20;
		j2.y = 21;
		
		
		
		// j1.andar(Direcão.NORTE);
		// j1.andar(Direcão.NORTE);
		// j1.andar(Direcão.NORTE);
		// j1.andar(Direcão.NORTE);
	
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}	
}
