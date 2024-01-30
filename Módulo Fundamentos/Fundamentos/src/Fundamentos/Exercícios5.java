package Fundamentos;

import java.util.Scanner;

public class Exercícios5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) /2;
		
		System.out.println("A Área do Triângulo é: " + area);
		
		scanner.close();
	}
}
