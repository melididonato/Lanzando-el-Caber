import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LanzamientoTests {
	@Test
	public void queGuardaDistanciaTotal() {
		Lanzamiento lanzamiento = new Lanzamiento(100.00,5.00);	
		assertEquals(100.00, lanzamiento.getDistanciaReal(), 0);
	}
	@Test
	public void queGuardaOchentaPorCiento() {
		Lanzamiento lanzamiento = new Lanzamiento(100.00,35.00);
		assertEquals(80.00, lanzamiento.getDistanciaReal(), 0);
	}
	@Test
	public void queDacero() {
		Lanzamiento lanzamiento = new Lanzamiento(100.00,95.00);
		assertEquals(0.00, lanzamiento.getDistanciaReal(), 0);
	}
	@Test
	public void queEsTiroDescalificado() {
		Lanzamiento lanzamiento = new Lanzamiento(100.00,95.00);
		assertEquals(true, lanzamiento.esTiroDescalificado());
	}
	@Test
	public void queEsTiroValido() {
		Lanzamiento lanzamiento = new Lanzamiento(100.00,20.00);
		assertEquals(false, lanzamiento.esTiroDescalificado());
	}
	@Test
	public void queTomaAnguloNegativo() {
		Lanzamiento lanzamiento = new Lanzamiento(50.50, -34.80);
		assertEquals(-34.80, lanzamiento.getAngulo(), 0);
	}
	@Test
	public void queDescalificaAnguloNegativo() {
		Lanzamiento lanzamiento = new Lanzamiento(50.50, -109.60);
		assertEquals(true, lanzamiento.esTiroDescalificado());
	}
	@Test
	public void queCalificaAnguloNegativo() {
		Lanzamiento lanzamiento = new Lanzamiento(90.00, -6.50);
		assertEquals(false, lanzamiento.esTiroDescalificado());
	}
}
