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
		this.consistencia = calcularConsistencia();
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
		double toleranciaAngulo = 5.0;
		double resultado = 0;
		if(!this.tiros.get(0).esTiroDescalificado() && !this.tiros.get(1).esTiroDescalificado() && !this.tiros.get(2).esTiroDescalificado()) {	
			double distanciaReal1 = this.tiros.get(0).getDistanciaReal();
			double distanciaReal2 = this.tiros.get(1).getDistanciaReal();
			double distanciaReal3 = this.tiros.get(2).getDistanciaReal();
			if(Math.abs(distanciaReal1-distanciaReal2) > tolerancia) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
			if(Math.abs(distanciaReal1-distanciaReal3) > tolerancia) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
			if(Math.abs(distanciaReal2-distanciaReal3) > tolerancia) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
			double angulo1 = this.tiros.get(0).getAngulo();
			double angulo2 = this.tiros.get(1).getAngulo();
			double angulo3 = this.tiros.get(2).getAngulo();
			if(Math.abs(angulo1-angulo2) > toleranciaAngulo) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
			if(Math.abs(angulo1-angulo3) > toleranciaAngulo) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
			if(Math.abs(angulo2-angulo3) > toleranciaAngulo) {
				resultado -= 10;
			} else {
				resultado += 10;
			}
		}
		return resultado;
	}
}
