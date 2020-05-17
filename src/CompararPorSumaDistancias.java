import java.util.Comparator;

public class CompararPorSumaDistancias implements Comparator<Lanzador>{

	@Override
	public int compare(Lanzador lanzador1, Lanzador lanzador2) {
		// TODO Auto-generated method stub
		if (lanzador1.getSumaDistancias() - lanzador2.getSumaDistancias() > 0) {
			return -1;
		} else if (lanzador1.getSumaDistancias() - lanzador2.getSumaDistancias() < 0) {
			return 1;
		}
		return 0;

	}

}
