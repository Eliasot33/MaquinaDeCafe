package Cafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestAzuquero {

	Azucarero azuquero;
	
	@Before
	public void setUp() {
		azuquero = new Azucarero(10);
	}
	@Test
	public void DeberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero() {
		
		boolean resultado = azuquero.hasAzucar(5);
		
		assertEquals(true, resultado);
		
		resultado = azuquero.hasAzucar(10);
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void DeberiaDevolverFalsoSiNoHaySuficienteAzucarEnElAzuquero() {
		
		boolean resultado = azuquero.hasAzucar(15);
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void DeberiaRestarAzucarAlAzuquero() {
		
		azuquero.giveAzucar(5);
		assertEquals(5, azuquero.getCantidadAzucar());
		
		azuquero.giveAzucar(2);
		assertEquals(3, azuquero.getCantidadAzucar());
		
	}

}
