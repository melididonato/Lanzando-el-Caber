import java.util.ArrayList;

public class Lanzador implements Comparable<Lanzador> {
	private int numero;
	private ArrayList<Lanzamiento> tiros;
	private double sumaDistancias;
	private double consistencia;
	
	public Lanzador(int numero, ArrayList<Lanzamiento> tiros) {
		this.numero = numero;
		this.tiros = tiros;
		this.sumaDistancias = this.tiros.get(0).getDistanciaReal() 
							+ this.tiros.get(1).getDistanciaReal()
							+ this.tiros.get(2).getDistanciaReal();
		this.consistencia = 1;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSumaDistancias() {
		return this.sumaDistancias;
	}
	
	public void sumarDistanciasReales() {
		
	}
	
	public void calcularConsistencia() {
		
	}

	@Override
	public int compareTo(Lanzador lanzador2) {
		if(this.sumaDistancias == lanzador2.getSumaDistancias())
			return 0;
		else if(this.sumaDistancias > lanzador2.getSumaDistancias())
			return 1;
		return -1;
	}
}
