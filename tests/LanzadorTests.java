import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LanzadorTests {
	@Test
	public void queSumaDistanciasReales() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 3.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(300, lanzador.getSumaDistancias(), 0);
	}
	@Test
	public void queSumaDistanciasRealesConAngulosNegativos() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, -20.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, -2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, -3.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(300, lanzador.getSumaDistancias(), 0);
	}
	@Test
	public void queCalculaConsistencia() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, 5.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 2.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(60.00, lanzador.getConsistencia(), 0);
	}
	public void queCalculaConsistenciaConAngulosNegativos() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, -5.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, -2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, -2.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(60.00, lanzador.getConsistencia(), 0);
	}
	@Test
	public void queNoEsConsistente() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(10.00, 5.00);
		Lanzamiento tiro2 = new Lanzamiento(50.00, 36.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 96.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(0.00, lanzador.getConsistencia(), 0);
	}
	@Test
	public void queNoEsConsistenteConAngulosNegativos() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(120.00, -15.00);
		Lanzamiento tiro2 = new Lanzamiento(59.00, -6.00);
		Lanzamiento tiro3 = new Lanzamiento(10.00, -96.50);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
		assertEquals(0.00, lanzador.getConsistencia(), 0);
	}
}
