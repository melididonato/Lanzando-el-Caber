import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LanzadorTests {
	@Test
	public void queCalculaConsistencia() {
		ArrayList<Lanzamiento> tiros = new ArrayList<Lanzamiento>();
		Lanzamiento tiro1 = new Lanzamiento(100, 30);
		Lanzamiento tiro2 = new Lanzamiento(100, 35);
		Lanzamiento tiro3 = new Lanzamiento(100, 32);
		tiros.add(tiro1);
		tiros.add(tiro2);
		tiros.add(tiro3);
		Lanzador lanzador = new Lanzador(1, tiros);
	}
}
