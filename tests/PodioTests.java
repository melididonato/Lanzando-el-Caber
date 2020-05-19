import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PodioTests {
	@Test
	public void primerPuesto() {
		Podio podio = new Podio(1,2,3);
		assertEquals(1, podio.getPrimerPuesto(), 0);
	}
	@Test
	public void segundoPuesto() {
		Podio podio = new Podio(1,2,3);
		assertEquals(2, podio.getSegundoPuesto(), 0);
	}
	@Test
	public void TercerPuesto() {
		Podio podio = new Podio(1,2,3);
		assertEquals(3, podio.getTercerPuesto(), 0);
	}
}
