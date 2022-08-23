package Cafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextCafetera {

	@Test
	public void DeberiaDevolverVerdaderoSiExisteCafe() {
		Cafetera cafetera = new Cafetera(10);
		
		boolean resultado = 
				cafetera.hasCafe(5);
		
		assertEquals(true,resultado);
	}
	
	@Test
	public void DeberiaDevolverFalsoSiNoExisteCafe() {
		Cafetera cafetera = new Cafetera(10);
		
		boolean resultado = 
				cafetera.hasCafe(11);
		
		assertEquals(false,resultado);
	}
	
	@Test
	public void DeberiaRestarCafeALACafetera() {
		Cafetera cafetera = new Cafetera(10);
		
		cafetera.giveCafe(7);
		
		assertEquals(4, cafetera.getCantidadCafe());
	}
	
	

}
