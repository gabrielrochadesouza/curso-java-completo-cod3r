package Fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 5.6;
		// String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado.";	
		String resultadoFinal = media >= 7.0 ? 
		"aprovado." : "recuperação.";
		
		System.out.println("O Aluno está " + resultadoFinal);	
	}
}
