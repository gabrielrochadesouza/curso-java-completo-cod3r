package Controle;

import java.util.Scanner;

public class Exercício1 {

	/**
	 * 1. Criar um progama que receba um número e verifique se está entre 0 e
	 * 10 e é par;
	 */
	
	public static void main(String[] args) {
	
		Scanner	scanner = new Scanner (System.in);
	    
		int numero = scanner.nextInt(); 	
		
		if (numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O numero" + numero + "está entre 0 a 10 e é um par.");
			}else {
				System.out.println("O numero" + numero + "está entre 0 a 10 mas não é um par.");
			}
		} else {
			System.out.println("O numero " + numero + "não está entre 0 a 10.");
		}
		
		
		scanner.close();
	}
}
