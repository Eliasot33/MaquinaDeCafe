package Cafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestMaquinaDeCafe {

	Cafetera cafetera;
	Vaso vasosPequeno;
	Vaso vasosMediano;
	Vaso vasosGrande;
	Azucarero azucarero;
	MaquinaDeCafe maquinaDeCafe;
	
	@Before
	public void setUp() {
		cafetera = new Cafetera(50);
		vasosPequeno = new Vaso(5,10);
		vasosMediano = new Vaso(5,20);
		vasosGrande = new Vaso(5,30);
		azucarero = new Azucarero(20);
		
		maquinaDeCafe = new MaquinaDeCafe();
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setVasosPequeno(vasosPequeno);
		maquinaDeCafe.setVasosMediano(vasosMediano);
		maquinaDeCafe.setVasosGrande(vasosGrande);
		maquinaDeCafe.setAzucarero(azucarero);
	}
	@Test
	public void DeberiaDevolverUnVasoPequeno() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		assertEquals(maquinaDeCafe.vasosPequeno, vaso);
	}
	
	@Test
	public void DeberiaDevolverUnVasoMediano() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("mediano");
		assertEquals(maquinaDeCafe.vasosMediano, vaso);
	}
	
	@Test
	public void DeberiaDevolverUnVasoGrande() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("grande");
		assertEquals(maquinaDeCafe.vasosGrande, vaso);
	}
	
	@Test
	public void DeberiaDevolverNoHayVasos() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		
		String resultado = maquinaDeCafe.GetVasoDeCafe(vaso, 10, 2);
		assertEquals("No hay vasos", resultado);
	}
	
	@Test
	public void DeberiaDevolverNoHayCafe() {
		
		cafetera = new Cafetera(5);
		maquinaDeCafe.setCafetera(cafetera);
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2);
		assertEquals("No hay cafe", resultado);
	}
	
	@Test
	public void DeberiaDevolverNoHayAzucar() {
		
		azucarero = new Azucarero(2);
		maquinaDeCafe.setAzucarero(azucarero);
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		assertEquals("No hay azucar", resultado);
	}
	
	@Test
	public void DeberiaRestarCafe() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		int resultado = maquinaDeCafe.getCafetera().getCantidadCafe();
		assertEquals(40, resultado);
		
	}
	
	@Test
	public void DeberiaRestarCafe() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		int resultado = maquinaDeCafe.getVasosPequeno().getCantidadVasos();
		assertEquals(4, resultado);
		
	}
	
	@Test
	public void DeberiaRestarCafe() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		int resultado = maquinaDeCafe.getAzucarero().getCantidadAzucar();
		assertEquals(17, resultado);
		
	}
	
	@Test
	public void DeberiaDevolverFelicitaciones() {
		
		Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
		String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
		assertEquals("Felicitaciones", resultado);
		
	}

}
