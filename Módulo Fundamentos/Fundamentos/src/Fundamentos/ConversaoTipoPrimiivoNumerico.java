package Fundamentos;

public class ConversaoTipoPrimiivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float)1.12345; // explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.0;
		int f = (int ) e ; //explícita (CAST)
		System.out.println(f);


	}
}
