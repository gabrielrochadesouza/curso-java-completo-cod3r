package Fundamentos;

import java.util.Scanner;

public class Exercícios2 {
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.println("Valor em celsius:" + conversao);
		
		scanner.close();
		
	}
	
}
