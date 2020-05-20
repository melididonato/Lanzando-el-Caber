import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class CompetenciaTests {

	@Test
	public void DistanciasSinLanzadoresLosPodiosQuedanEn0() {
		Competencia competencia = new Competencia(new ArrayList<Lanzador>());
		competencia.generarPodioDistancia();
		assertEquals(0, competencia.getPodioDistancia().primerPuesto);
		assertEquals(0, competencia.getPodioDistancia().segundoPuesto);
		assertEquals(0, competencia.getPodioDistancia().tercerPuesto);
	}
	
	@Test
	public void ResultadoDistanciasLanzador1PrimerPuestoLanzador2SegundoPuestoLanzador3TercerPuesto() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 3.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		
		ArrayList<Lanzador> lanzadores = new ArrayList<Lanzador>();
		Lanzador lanzador1 = new Lanzador(1, tiros);
		Lanzador lanzador2 = new Lanzador(2, tiros);
		Lanzador lanzador3 = new Lanzador(3, tiros);
		
		lanzador1.sumaDistancias = 33;
		lanzador2.sumaDistancias = 23;
		lanzador3.sumaDistancias = 13;
		lanzadores.add(lanzador1);
		lanzadores.add(lanzador2);
		lanzadores.add(lanzador3);
		
		Competencia competencia = new Competencia(lanzadores);
		competencia.generarPodioDistancia();
		
		assertEquals(1, competencia.getPodioDistancia().primerPuesto);
		assertEquals(2, competencia.getPodioDistancia().segundoPuesto);
		assertEquals(3, competencia.getPodioDistancia().tercerPuesto);
	}
	
	@Test
	public void ConsistenciasSinLanzadoresLosPodiosQuedanEn0() {
		Competencia competencia = new Competencia(new ArrayList<Lanzador>());
		competencia.generarPodioConsistencia();
		assertEquals(0, competencia.getPodioConsistencia().primerPuesto);
		assertEquals(0, competencia.getPodioConsistencia().segundoPuesto);
		assertEquals(0, competencia.getPodioConsistencia().tercerPuesto);
	}
	
	@Test
	public void ResultadoConsistenciasLanzador1PrimerPuestoLanzador2SegundoPuestoLanzador3TercerPuesto() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100.00, 20.00);
		Lanzamiento tiro2 = new Lanzamiento(100.00, 2.00);
		Lanzamiento tiro3 = new Lanzamiento(100.00, 3.00);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		
		ArrayList<Lanzador> lanzadores = new ArrayList<Lanzador>();
		Lanzador lanzador1 = new Lanzador(1, tiros);
		Lanzador lanzador2 = new Lanzador(2, tiros);
		Lanzador lanzador3 = new Lanzador(3, tiros);
		
		lanzador1.consistencia = 33;
		lanzador2.consistencia = 23;
		lanzador3.consistencia = 13;
		lanzadores.add(lanzador1);
		lanzadores.add(lanzador2);
		lanzadores.add(lanzador3);
		
		Competencia competencia = new Competencia(lanzadores);
		competencia.generarPodioConsistencia();
		
		assertEquals(1, competencia.getPodioConsistencia().primerPuesto);
		assertEquals(2, competencia.getPodioConsistencia().segundoPuesto);
		assertEquals(3, competencia.getPodioConsistencia().tercerPuesto);
	}
	
}
