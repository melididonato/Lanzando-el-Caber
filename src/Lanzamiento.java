
public class Lanzamiento {
	private double distanciaRecorrida;
	private double angulo;
	private double distanciaReal;
	
	public Lanzamiento(double distanciaRecorrida, double angulo) {
		this.distanciaRecorrida = distanciaRecorrida;
		this.angulo = angulo;
		this.distanciaReal = calcularDistanciaReal();
	}

	public double getAngulo() {
		return angulo;
	}
	public double getDistanciaReal() {
		return distanciaReal;
	}
	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	///PEDIR AYUDA
	public double calcularDistanciaReal() {
		if((this.angulo > 0 && this.angulo < 30) || (this.angulo < 0 && this.angulo > -30) ) {
			return this.distanciaRecorrida;
		}
		if((this.angulo > 30 && this.angulo < 90) || (this.angulo < -30 && this.angulo > -90) ) {
			this.distanciaReal = (((this.distanciaRecorrida) * 80) / 100);
			return this.distanciaReal;
		}
		if((this.angulo > 90 ) || (this.angulo < -90) ) {
			this.distanciaReal = 0; ///descalificado.
			return this.distanciaReal;
		}
		return 0;
	}
}
