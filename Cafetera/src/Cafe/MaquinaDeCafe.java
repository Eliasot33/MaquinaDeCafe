package Cafe;

public class MaquinaDeCafe {
	Cafetera cafe;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azucar;
	
	public Vaso getTipoDeVaso(String tipoDeVaso) {
		
		Vaso vaso
		if(tipoDeVaso == "pequeño") {
			return vasosPequeno;
		}
		if(tipoDeVaso == "mediano") {
			return vasosMediano;
		}
		if(tipoDeVaso == "grande") {
			return vasosGrande;
		}
	}
	
	 public void getVasoDeCafe(String tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
		 
	 }
	 
	 
}
