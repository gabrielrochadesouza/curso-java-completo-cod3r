	package oo.herança.teste;

import Desafio.Carro;
import Desafio.Ferrari;
import Desafio.Limusine;

public class CarroTeste {

	public static void main(String[] args) {
		
	Carro c1 = new Ferrari();

	c1.acelerar();
	System.out.println(c1);
	
	c1.acelerar();
	System.out.println(c1);

	c1.acelerar();
	System.out.println(c1);
	
	Limusine c2 = new Limusine(400);
	c2.ligarTurbo();
	c2.ligarAr();
	c2.desligarAr();
	
	System.out.println(c2.VelocidadeDOAr());
	
	c2.acelerar();
	c2.frear();
	System.out.println(c2);
	
	c2.acelerar();
	c2.frear();
	System.out.println(c2);
	
	c2.acelerar();
	System.out.println(c2);
	}
}