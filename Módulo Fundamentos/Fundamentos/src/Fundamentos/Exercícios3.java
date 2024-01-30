package Fundamentos;

import java.util.Scanner;

public class Exercícios3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite O peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a sua altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura );
		
		System.out.print("IMC: " + imc);
		
		scanner.close();
	}
}
