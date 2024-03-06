package Arrays;

import java.util.Arrays;

public class Exercício {

	public static void main(String[] args) {
		
	
	double[] notasAlunoA = new double[3];
	System.out.println(Arrays.toString(notasAlunoA));
	
	notasAlunoA[0] = 7.9;
	notasAlunoA[1] = 8; 
	notasAlunoA[2] = 6.6;	
	// notasAlunoA[3] = 9.7;
	
	
	System.out.println(Arrays.toString(notasAlunoA));
	System.out.println(notasAlunoA[0]);
	System.out.println(notasAlunoA[notasAlunoA.length - 1]);
    // System.out.println(notasAlunoA[4]); Erro!
	
	double totalAlunoA = 0;
	for(int i = 0; i < notasAlunoA.length; i++) {
		totalAlunoA += notasAlunoA[i]; 	
	}
   
	System.out.println(totalAlunoA / notasAlunoA.length);
   
   final double notaArmazenada = 5.9;
   double[] notasAlunoB = { 6.9, 8.5,notaArmazenada, 9.7 };
   
   double totalAlunoB = 0;
   for (int i = 0; i < notasAlunoB.length; i++) {
	   totalAlunoB += notasAlunoB[i];
	   }
   	   
       System.out.println(totalAlunoB / notasAlunoB.length);
	 }
   }

