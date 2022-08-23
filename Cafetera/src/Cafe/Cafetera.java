package Cafe;

public class Cafetera {
	
	int cantidadCafe;
	Cafetera(int cantidadCafe){
		this.cantidadCafe = cantidadCafe;
	}
	public void setCantidadDeCafe(int param1) {
		cantidadCafe = param1;
	}
	public int getCantidadCafe() {
		return cantidadCafe;
	}
	
	public void hasCafe(int cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}
	public int giveCafe(int cantidadCafe) {
		this.cantidadCafe += cantidadCafe;
		return this.cantidadCafe;
	}
}
