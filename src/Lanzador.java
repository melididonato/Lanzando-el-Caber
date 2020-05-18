import java.util.ArrayList;

public class Lanzador {
	public int numero;
	public ArrayList<Lanzamiento> tiros;
	public double sumaDistancias;
	public double consistencia;

	public Lanzador(int numero, ArrayList<Lanzamiento> tiros) {
		this.numero = numero;
		this.tiros = tiros;
		this.sumaDistancias = sumarDistanciasReales();
		this.setConsistencia(calcularConsistencia());
	}

	public int getNumero() {
		return this.numero;
	}

	public double getSumaDistancias() {
		return this.sumaDistancias;
	}

	public double getConsistencia() {
		return consistencia;
	}

	public ArrayList<Lanzamiento> getTiros() {
		return tiros;
	}

	public void setTiros(ArrayList<Lanzamiento> tiros) {
		this.tiros = tiros;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}

	public double sumarDistanciasReales() {
		return this.tiros.get(0).getDistanciaReal() + this.tiros.get(1).getDistanciaReal()
				+ this.tiros.get(2).getDistanciaReal();
	}

	public double calcularConsistencia() {
		double tolerancia = 0.15;
		double toleranciaAngulos = 5.0;
		double resultado = 0;
		
		if(!this.tiros.get(0).esTiroDescalificado() && !this.tiros.get(1).esTiroDescalificado() && !this.tiros.get(2).esTiroDescalificado()) {	
			for (int i = 1; i < 3; i++) {
				if (Math.abs((this.tiros.get(i - 1).getDistanciaReal() - this.tiros.get(i).getDistanciaReal())) < tolerancia) {
					resultado += 10;
				} else {
					resultado -= 10;
				}
			}
			for (int i = 1; i < 3; i++) {
				if (Math.abs((this.tiros.get(i - 1).getAngulo() - this.tiros.get(i).getAngulo())) < toleranciaAngulos) {
					resultado += 10;
				} else {
					resultado -= 10;
				}
			}
		}
		return resultado;
	}
}
