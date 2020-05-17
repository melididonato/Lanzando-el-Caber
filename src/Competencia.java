import java.util.ArrayList;
import java.util.Collections;
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
		return lanzadores;
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
		int i = 0;
		List<Lanzador> lanzadoresDistancia = lanzadores;
		lanzadoresDistancia.sort(new CompararPorSumaDistancias());
		while (i < lanzadoresDistancia.size()) {
			if (i == 0) {
				this.podioDistancia.setPrimerPuesto(lanzadores.get(i).getNumero());
			}
			if (i == 1) {
				this.podioDistancia.setSegundoPuesto(lanzadores.get(i).getNumero());
			}
			if (i == 2) {
				this.podioDistancia.setTercerPuesto(lanzadores.get(2).getNumero());
			}

			i++;
		}

	}

	public void generarPodioConsistencia() {
		int i = 0;
		List<Lanzador> lanzadoresConsistentes = new ArrayList<Lanzador>();

		for (Lanzador lanzador : this.lanzadores) {
			if (!lanzador.getTiros().get(0).getDescalificado() && !lanzador.getTiros().get(1).getDescalificado()
					&& !lanzador.getTiros().get(2).getDescalificado()) {
				lanzadoresConsistentes.add(lanzador);
			}
		}

		lanzadoresConsistentes.sort(new CompararPorConsistencia());
		while (i < lanzadoresConsistentes.size()) {
			if (i == 0) {
				this.podioConsistencia.setPrimerPuesto(lanzadores.get(i).getNumero());
			}
			if (i == 1) {
				this.podioConsistencia.setSegundoPuesto(lanzadores.get(i).getNumero());
			}
			if (i == 2) {
				this.podioConsistencia.setTercerPuesto(lanzadores.get(i).getNumero());
			}

			i++;
		}

	}

}
