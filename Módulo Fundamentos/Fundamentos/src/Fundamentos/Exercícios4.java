package Fundamentos;

import java.util.Scanner;

public class Exercícios4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.println("O valor de quadrado é: " + quadrado + "\n O valor de cubo é: " + cubo);
		
		scanner.close();
	}
}
