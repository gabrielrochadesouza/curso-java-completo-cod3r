package Fundamentos;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b );
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 3);
		
		double nota = 6.3;
		boolean bomComportamentamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean  temDesconto =  bomComportamentamento &&  passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	
	}
}
