package Pratica1;

import java.util.Scanner;

public class Exercíci10 {

public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("\nDigite um numero para verificar se é um primo");
		int numero = scanner.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		if(contadorDeDivisores == 0) {
			System.out.println("\n0 numero" + numero + " é primo");
			
		} else {
			System.out.println("\n0 numero" + numero + " não é primo");
		
		}
		scanner.close();
	}
}

