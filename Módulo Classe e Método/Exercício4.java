package Pratica1;

public class Exercício4 {

	public static void main(String[] args) {
		
		// Númericos Inteiros
	byte anosDeEmpresa = 40;
	short numeroDeVoos = 600;
	int id = 59505;
	long pontosAcumulados = 3_500_865_956_223L;
	
	// Número Reais ou numeros quebrados
	
	float salario = 16_445.98F;
	double VendasAcumuladas = 3_991_890_650_960.56;
	
	boolean estaDeFerias = true; // verdadeiro(true) ou falso(false)
	
	char status = 'A';
	
	System.out.println(anosDeEmpresa * 365);
	
	System.out.println(numeroDeVoos / 3);
	
	System.out.println(pontosAcumulados / VendasAcumuladas );
	
	System.out.println(id + ":ganha-> " +salario);
	System.out.println("ferias: " + estaDeFerias);
	System.out.println("status: " + status);
	
	}
}
