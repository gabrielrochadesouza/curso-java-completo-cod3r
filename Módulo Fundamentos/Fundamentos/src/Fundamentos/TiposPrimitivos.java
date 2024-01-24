package Fundamentos;

public class TiposPrimitivos {
	
	public static void main (String[] args ) {
		// informações do funcionario
		
		// tipos númericos inteiros
		byte anosDeEmpresa = 23;
	    short numerosDeVoos = 542;
	    int id = 56789;
	    long pontosAcumulados = 3_134_845_223L;
	    
	    // Tipos numéricos reais
	    
	    float salario = 11_445.44F;
	    double vendasAcumuladas = 2_991_797_103.01;
	    
	    // Tipo booleano
	    boolean estaDeFerias = false; //true  
	    
	    // tipo caractere
	    char status = 'A'; // ativo
	    
	    // Dias de Empresa
	    System.out.println(anosDeEmpresa * 365); 
	    
	    // Numero de viagens
	    System.out.println(numerosDeVoos / 2 );
	    
	    // pontos por real
	    System.out.println(pontosAcumulados / vendasAcumuladas);
	    
	    System.out.println(id + ": ganha-> " + salario);
	    System.out.println("Férias: " + estaDeFerias);
	    System.out.println("status: " +  status);
	    
	    
	}
}
