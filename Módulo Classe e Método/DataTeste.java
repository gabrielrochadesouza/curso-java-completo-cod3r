package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.imprimirDataFormatada();
		d1.ano = 2021;
		
		var d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormada());
	
	    d1.imprimirDataFormatada();
	    d2.imprimirDataFormatada();
	}
}
