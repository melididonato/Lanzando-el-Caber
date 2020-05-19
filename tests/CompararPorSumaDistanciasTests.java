import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CompararPorSumaDistanciasTests {

	@Test
	public void CompararDistanciasBMayorQueA() {
		CompararPorSumaDistancias comparator = new CompararPorSumaDistancias();
		
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100, 20);
		Lanzamiento tiro2 = new Lanzamiento(100, 2);
		Lanzamiento tiro3 = new Lanzamiento(100, 3);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzadorA = new Lanzador(1, tiros);
		
		ArrayList<Lanzamiento> tirosB = new ArrayList<Lanzamiento>();
		Lanzamiento tiro4 = new Lanzamiento(110, 20);
		Lanzamiento tiro5 = new Lanzamiento(110, 2);
		Lanzamiento tiro6 = new Lanzamiento(110, 3);
		tirosB.add(tiro4);
		tirosB.add(tiro5);
		tirosB.add(tiro6);
		Lanzador lanzadorB = new Lanzador(2, tirosB);
		
		int comparacion = comparator.compare(lanzadorA, lanzadorB);
		assertEquals(1, comparacion);
	}
	
	@Test
	public void CompararPorDistanciasDaIgual() {
		CompararPorSumaDistancias comparator = new CompararPorSumaDistancias();
		ArrayList<Lanzamiento> tirosB = new ArrayList<Lanzamiento>();
		Lanzamiento tiro4 = new Lanzamiento(100, 20);
		Lanzamiento tiro5 = new Lanzamiento(100, 2);
		Lanzamiento tiro6 = new Lanzamiento(100, 3);
		tirosB.add(tiro4);
		tirosB.add(tiro5);
		tirosB.add(tiro6);
		Lanzador lanzadorA = new Lanzador(1, tirosB);
		Lanzador lanzadorB = new Lanzador(2,tirosB);
		
		int comparacion = comparator.compare(lanzadorA, lanzadorB);
		assertEquals(0, comparacion);
	}
}
