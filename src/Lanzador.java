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
		this.consistencia = calcularConsistencia();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSumaDistancias() {
		return this.sumaDistancias;
	}
	
	public void sumarDistanciasReales() {
		
	}
	
	
	public double calcularConsistencia() {
		double tolerancia = 0.15;
		double toleranciaAngulos = 5.0;
		double sumador=0;
		for(int i=1;i<this.tiros.size();i++) {
			if(Math.abs((this.tiros.get(i-1).getDistanciaReal() - this.tiros.get(i).getDistanciaReal())) < tolerancia) {
				sumador+=10;
			}else {
				sumador-=10;
			}
		}
		for(int i=1;i<this.tiros.size();i++) {
			if(Math.abs((this.tiros.get(i-1).getAngulo() - this.tiros.get(i).getAngulo())) < toleranciaAngulos) {
				sumador+=10;
			}else {
				sumador-=10;
			}
		}
		
		return sumador;
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
