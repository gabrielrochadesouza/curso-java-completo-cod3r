package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2024;
		
		
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2023;
		
		String dataFormatada1 = d1.obterDataFormada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormada());
	
	    d1.imprimirDataFormatada();
	    d2.imprimirDataFormatada();
	}
}
