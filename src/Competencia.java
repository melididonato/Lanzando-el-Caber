
import java.util.ArrayList;
import java.util.List;

public class Competencia {
	public List<Lanzador> lanzadores = new ArrayList<Lanzador>();
	public Podio podioDistancia;
	public Podio podioConsistencia;

	public Competencia(ArrayList<Lanzador> lanzadores) {
		this.lanzadores = lanzadores;
		this.podioDistancia = new Podio();
		this.podioConsistencia = new Podio();
	}

	public List<Lanzador> getLanzadores() {
		return this.lanzadores;
	}

	public void setLanzadores(List<Lanzador> lanzadores) {
		this.lanzadores = lanzadores;
	}

	public Podio getPodioDistancia() {
		return podioDistancia;
	}

	public void setPodioDistancia(Podio podioDistancia) {
		this.podioDistancia = podioDistancia;
	}

	public Podio getPodioConsistencia() {
		return podioConsistencia;
	}

	public void setPodioConsistencia(Podio podioConsistencia) {
		this.podioConsistencia = podioConsistencia;
	}

	public void generarPodioDistancia() {
		this.lanzadores.sort(new CompararPorSumaDistancias());
		this.podioDistancia.setPrimerPuesto(this.lanzadores.get(0).getNumero());
		this.podioDistancia.setSegundoPuesto(this.lanzadores.get(1).getNumero());
		this.podioDistancia.setTercerPuesto(this.lanzadores.get(2).getNumero());
	}
	
	public void generarPodioConsistencia() {
		List<Lanzador> lanzadoresConsistentes = new ArrayList<Lanzador>();
		for (Lanzador lanzador : this.lanzadores) {
			if (!lanzador.getTiros().get(0).esTiroDescalificado() && !lanzador.getTiros().get(1).esTiroDescalificado()
					&& !lanzador.getTiros().get(2).esTiroDescalificado()) {
				lanzadoresConsistentes.add(lanzador);
			}
		}
		lanzadoresConsistentes.sort(new CompararPorConsistencia());
		int cantidadConsistentes = lanzadoresConsistentes.size();
		if(cantidadConsistentes >= 1) {
			this.podioConsistencia.setPrimerPuesto(lanzadoresConsistentes.get(0).getNumero());
		}
		if(cantidadConsistentes >= 2) {
			this.podioConsistencia.setSegundoPuesto(lanzadoresConsistentes.get(1).getNumero());
		}
		if(cantidadConsistentes >= 3) {
			this.podioConsistencia.setTercerPuesto(lanzadoresConsistentes.get(2).getNumero());
		}
	}
}
