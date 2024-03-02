package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo Primitivo)
	
		a++;
		
		b--;
	
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2024);
		Data d2 = d1; // atribuição por refência (objeto)
	
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2030;
		
		System.out.println(d1.obterDataFormada());
		System.out.println(d2.obterDataFormada());
		
		voltarDataParaValorPadrão(d1);
		
		System.out.println(d1.obterDataFormada());
		System.out.println(d2.obterDataFormada());
	
		int c = 8;
		alterarPrimitivo(c);
		System.out.println(c);
	
	
	}
	
	static void voltarDataParaValorPadrão(Data d) {
		d.dia = 30;
		d.mes = 12;
		d.ano = 1999;
		
		
	}
	static void alterarPrimitivo(int a) {
		 a++;
	}



}
