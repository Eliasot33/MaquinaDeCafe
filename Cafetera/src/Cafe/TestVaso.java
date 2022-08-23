package Cafe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestVaso {

	@Test
	public void DeberiaDevolverVerdaderoSiExistenVasos() {
		
		Vaso vasosPequenos = new Vaso(2,10);
		boolean resultado = 
				vasosPequenos.hasVasos(1);
		assertEquals(true,resultado);
	}
	
	@Test
	public void DeberiaDevolverFalsoSiNoExistenVasos() {
		
		Vaso vasospequenos = new Vaso(1,10);
		
		boolean resultado = 
				vasosPequenos.hasVasos(2);
		
		assertEquals(false,resultado);
		
	}
	
	@Test
	public void DeberiaRestarCantidadDeVaso() {
		
		Vaso vasospequenos = new Vaso(5,10);
		
		boolean resultado = 
				vasosPequenos.giveVasos(1);
		
		assertEquals(4,vasosPequenos.getCantidadVasos());
		
	}

}
