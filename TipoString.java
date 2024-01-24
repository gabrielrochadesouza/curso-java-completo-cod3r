package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(02));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		
		var nome = "Gabriel";
		var sobrenome = "Rocha";
		var idade = "17";
		var salario = "12345.937";
		 	
		String maisUmaFrase = "Nome:" + nome + "\nsobrenome:"
		+ sobrenome + "\nIdade:" + idade + "\nSalario:" + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		
		String frase = String.format("O Senhor  %s %s tem %d e ganha R$%.2f.",
		nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}	

}
