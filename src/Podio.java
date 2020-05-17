
public class Podio {
	public int primerPuesto;
	public int segundoPuesto;
	public int tercerPuesto;
	
	public Podio() {
		this.primerPuesto = 0;
		this.segundoPuesto = 0;
		this.tercerPuesto = 0;
	}
	
	public Podio(int primerPuesto, int segundoPuesto, int tercerPuesto) {
		this.primerPuesto = primerPuesto;
		this.segundoPuesto = segundoPuesto;
		this.tercerPuesto = tercerPuesto;
	}

	public int getPrimerPuesto() {
		return primerPuesto;
	}

	public void setPrimerPuesto(int primerPuesto) {
		this.primerPuesto = primerPuesto;
	}

	public int getSegundoPuesto() {
		return segundoPuesto;
	}

	public void setSegundoPuesto(int segundoPuesto) {
		this.segundoPuesto = segundoPuesto;
	}

	public int getTercerPuesto() {
		return tercerPuesto;
	}

	public void setTercerPuesto(int tercerPuesto) {
		this.tercerPuesto = tercerPuesto;
	}
	
}
