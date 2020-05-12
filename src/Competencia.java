import java.util.ArrayList;
import java.util.List;

public class Competencia {
	List<Lanzador> lanzadores = new ArrayList<Lanzador>();
	private Podio podioDistancia;
	private Podio podioConsistencia;
	
	public Competencia(ArrayList<Lanzador> lanzadores) {
		this.lanzadores = lanzadores;
	}
	
	public Podio generarPodioDistancia() {
		
		return this.podioDistancia;
	}
	
	public Podio generarPodioConsistencia() {
		
		return this.podioConsistencia;
	}
	
}
