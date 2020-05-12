
public class Lanzamiento {
	private double distanciaRecorrida;
	private double angulo;
	private double distanciaReal;
	
	public Lanzamiento(double distanciaRecorrida, double angulo) {
		this.distanciaRecorrida = distanciaRecorrida;
		this.angulo = angulo;
		this.distanciaReal = calcularDistanciaReal();
	}

	public double getDistanciaReal() {
		return distanciaReal;
	}

	///PEDIR AYUDA
	public double calcularDistanciaReal() {
		return this.distanciaRecorrida;
	}
}
