import java.util.Comparator;

public class CompararPorConsistencia implements Comparator<Lanzador> {

	@Override
	public int compare(Lanzador lanzador1, Lanzador lanzador2) {
		// TODO Auto-generated method stub
		if (lanzador1.getConsistencia() > lanzador2.getConsistencia()) {
			return -1;
		} else if (lanzador1.getConsistencia() < lanzador2.getConsistencia()) {
			return 1;
		}
		return 0;

	}

}
