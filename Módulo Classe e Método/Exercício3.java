package Pratica1;

public class Exercício3 {

	public static void main(String[] args) {
		
		double fator = 5.0 / 9.0;
		double ajuste = 36;
		
		double fahrenheit = 90;
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado é " + celsius + "°c ");
	
	 fahrenheit = 120;
	 celsius =(fahrenheit - ajuste) * fator;
	 System.out.println("O resultado é " + celsius + "°c ");
	}
}
