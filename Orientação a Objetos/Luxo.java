package Desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	default int  VelocidadeDOAr() {
		return 1;
	}
	
}
