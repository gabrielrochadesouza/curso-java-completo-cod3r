package Pratica1;

import java.util.Scanner;

public class treino {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n"); // \n\n serve para deixar cada linha 
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		// pelo que eu entendi da pra colocar como símbulo de número %d 
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // s
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Gabriel");
		
		
		Scanner entrada = new Scanner(System.in);; /* System.in entrada e
		  System.out saída, Scanner tem que fazer o import java.util.Scanner
		 */
		
		System.out.print("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome  = entrada.nextLine();
		
		/*
		o número só pode ser inteiro da de fazer 
		calculo classe:byte, shout, int, Long */
		System.out.print("Digite a sua idade:");
		int idade  = entrada.nextInt();  
		
		
		System.out.printf("%s %s tem %d anos. ",
				nome, sobrenome, idade);
		
		// termina Scanner
		entrada.close(); 
	}
}

