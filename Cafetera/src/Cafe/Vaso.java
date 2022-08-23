package Cafe;

public class Vaso {
	int cantidadVasos;
	int contenido;
	
	public void setCantidadVasos(int param1){
		cantidadVasos = param1;
	}
	public int getCantidadVasos() {
		return cantidadVasos;
	}
	
	public void setContenido(int param1) {
		contenido = param1;
	}
	public int getContenido() {
		return contenido;
	}
	
	public int hasVasos(int cantidadVasos) {
		return cantidadVasos;
	}
	public void giveVasos(int cantidadVasos) {
		this.cantidadVasos += cantidadVasos;
	}
}
