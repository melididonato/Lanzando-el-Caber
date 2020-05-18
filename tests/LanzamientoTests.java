import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LanzamientoTests {
	///TESTS SOBRE DISTANCIA REAL
	@Test
	public void distanciaTotal() {
		Lanzamiento lanzamiento = new Lanzamiento(100,5);	
		assertEquals(100, lanzamiento.getDistanciaReal(),0);
	}
	@Test
	public void ochentaPorCiento() {
		Lanzamiento lanzamiento = new Lanzamiento(100,35);
		assertEquals(80, lanzamiento.getDistanciaReal(),0);
	}
	@Test
	public void cero() {
		Lanzamiento lanzamiento = new Lanzamiento(100,95);
		assertEquals(0, lanzamiento.getDistanciaReal(),0);
	}
	
	///TESTS SOBRE TIRO VALIDO O DESCALIFICADO
	@Test
	public void tiroDescalificado() {
		Lanzamiento lanzamiento = new Lanzamiento(100,95);
		assertEquals(true, lanzamiento.esTiroDescalificado());
	}
	@Test
	public void tiroValido() {
		Lanzamiento lanzamiento = new Lanzamiento(100,20);
		assertEquals(false, lanzamiento.esTiroDescalificado());
	}
}
