import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CompararPorConsistenciaTests {

	@Test
	public void CompararPorConsistenciaDaIgual() {
		CompararPorConsistencia comparator = new CompararPorConsistencia();
		
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 3.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzadorA = new Lanzador(1, tiros);
		
		ArrayList<Lanzamiento> tirosB = new ArrayList<Lanzamiento>();
		Lanzamiento tiro4 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro5 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro6 = new Lanzamiento(100.00, 3.00);
		tirosB.add(tiro4);
		tirosB.add(tiro5);
		tirosB.add(tiro6);
		Lanzador lanzadorB = new Lanzador(2, tirosB);
		
		int comparacion = comparator.compare(lanzadorA, lanzadorB);
		assertEquals(0, comparacion);
	}
	
	@Test
	public void CompararPorConsistenciaBMayorQueA() {
		CompararPorConsistencia comparator = new CompararPorConsistencia();
		ArrayList<Lanzamiento> tirosB = new ArrayList<Lanzamiento>();
		Lanzamiento tiro4 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro5 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro6 = new Lanzamiento(100.00, 3.00);
		tirosB.add(tiro4);
		tirosB.add(tiro5);
		tirosB.add(tiro6);
		Lanzador lanzadorA = new Lanzador(1, tirosB);
		lanzadorA.setConsistencia(0);
		
		Lanzador lanzadorB = new Lanzador(2,tirosB);
		lanzadorB.setConsistencia(5);
		int comparacion = comparator.compare(lanzadorA, lanzadorB);
		assertEquals(1, comparacion);
	}
	
	@Test
	public void CompararPorConsistenciaAMayorQueB() {
		CompararPorConsistencia comparator = new CompararPorConsistencia();
		ArrayList<Lanzamiento> tirosB = new ArrayList<Lanzamiento>();
		Lanzamiento tiro4 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro5 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro6 = new Lanzamiento(100.00, 3.00);
		tirosB.add(tiro4);
		tirosB.add(tiro5);
		tirosB.add(tiro6);
		Lanzador lanzadorA = new Lanzador(1, tirosB);
		lanzadorA.setConsistencia(5);
		
		Lanzador lanzadorB = new Lanzador(2,tirosB);
		lanzadorB.setConsistencia(0);
		int comparacion = comparator.compare(lanzadorA, lanzadorB);
		assertEquals(-1, comparacion);
	}

}
