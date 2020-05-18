import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LanzadorTests {
	@Test
	public void queSumaDistanciasReales() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100, 20);
		Lanzamiento tiro2 = new Lanzamiento(100, 2);
		Lanzamiento tiro3 = new Lanzamiento(100, 3);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(300, lanzador.getSumaDistancias(),0);
	}
	@Test
	public void queCalculaConsistencia() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100, 5);
		Lanzamiento tiro2 = new Lanzamiento(100, 2);
		Lanzamiento tiro3 = new Lanzamiento(100, 2);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(60, lanzador.getConsistencia(),0);
	}
	@Test
	public void queNoEsConsistente() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(10, 5);
		Lanzamiento tiro2 = new Lanzamiento(50, 36);
		Lanzamiento tiro3 = new Lanzamiento(100, 96);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(0, lanzador.getConsistencia(),0);
	}
}
