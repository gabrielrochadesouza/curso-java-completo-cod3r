package Pratica1;

import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("salário: %.1f%n",1234.5678);
		System.out.printf("Nome: %s%n", "Gabriel");
		
		Scanner entrada = new Scanner(System.in);;	
		
		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos",
				nome, sobrenome, idade);
		
		
		entrada.close();
	}
}
