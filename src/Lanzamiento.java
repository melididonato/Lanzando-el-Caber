
public class Lanzamiento {
	public double distanciaRecorrida;
	public double angulo;
	public double distanciaReal;

	public Lanzamiento(double distanciaRecorrida, double angulo) {
		this.distanciaRecorrida = distanciaRecorrida;
		this.angulo = angulo;
		this.distanciaReal = calcularDistanciaReal();
	}

	public double getAngulo() {
		return angulo;
	}

	public double getDistanciaReal() {
		return this.distanciaReal;
	}

	public double getDistanciaRecorrida() {
		return this.distanciaRecorrida;
	}

	public double calcularDistanciaReal() {
		double distanciaReal = 0;
		if ((this.angulo > 0 && this.angulo < 30) || (this.angulo < 0 && this.angulo > -30)) {
			distanciaReal = this.distanciaRecorrida;
		} 
		if ((this.angulo > 30 && this.angulo < 90) || (this.angulo < -30 && this.angulo > -90)) {
			distanciaReal = (((this.distanciaRecorrida) * 80) / 100);
		} 
		return distanciaReal;
	}
	
	public boolean esTiroDescalificado() {
		if(this.distanciaReal == 0) {
			return true;
		}
		return false;
	}
}
