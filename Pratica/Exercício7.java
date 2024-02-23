package Pratica1;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner (System.in);
	   
		System.out.println("Digite a nota:");
		
		double nota = entrada.nextDouble();
	
		//  menor >, maior <
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Invalida!!!");
		
		}else if (nota >= 8.1){
			System.out.println("Conceito A");
			System.out.println("Cola mais safado!!!");
		
		}else if (nota >= 6.1) {
		System.out.println("Conceito B");	
		System.out.println("Boa");
		
		}else if (nota >= 4.1){
		System.out.println("Conceito c");	
		System.out.println("vai Estudar");
		
		}else if (nota >= 2.1){
		System.out.println("COnceito D");	
		System.out.println("HAHAHA ta mais burro que eu");
		
		}else {
			System.out.println("Conceito E: " + "Burro demais");
		}
		
		
	//  menor >, maior <
		System.out.println("FIM!");
		entrada.close();
	}
}
