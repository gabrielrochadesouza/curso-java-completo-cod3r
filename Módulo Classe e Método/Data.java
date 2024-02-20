package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormada() {
	 return String.format("%d/%d/%d",dia,mes,ano); 
		}
  void imprimirDataFormatada() {
	  System.out.println(obterDataFormada());
	
}


}
