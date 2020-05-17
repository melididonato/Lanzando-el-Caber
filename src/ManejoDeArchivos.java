import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ManejoDeArchivos {

	public static void main(String[] args) {
		ArrayList<Lanzador> lanzadores = new ArrayList<Lanzador>();
		String path = "archivo.txt";
		leerArchivo(path, lanzadores);
		Competencia competencia = new Competencia(lanzadores);

		competencia.generarPodioDistancia();
		System.out.println(competencia.podioDistancia.primerPuesto);
		System.out.println(competencia.podioDistancia.segundoPuesto);
		System.out.println(competencia.podioDistancia.tercerPuesto);
		competencia.generarPodioConsistencia();
		System.out.println();
		System.out.println(competencia.lanzadores.get(0).getNumero());
		System.out.println(competencia.lanzadores.get(0).getConsistencia());
		System.out.println(competencia.lanzadores.get(1).getConsistencia());
		System.out.println(competencia.podioConsistencia.primerPuesto);
		System.out.println(competencia.podioConsistencia.segundoPuesto);
		System.out.println(competencia.podioConsistencia.tercerPuesto);

	}

	public static void leerArchivo(String path, ArrayList<Lanzador> lanzadores) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			double distanciaRecorrida, angulo;
			linea = br.readLine();
			int n = Integer.parseInt(linea);
			for (int i = 1; i <= n; i++) {
				ArrayList<Lanzamiento> lanzamiento = new ArrayList<Lanzamiento>();
				for (int j = 1; j <= n ; j++) {
					linea = br.readLine();
					String[] datos = linea.split("\t");
					distanciaRecorrida = Double.parseDouble(datos[0]);
					angulo = Double.parseDouble(datos[1]);
					Lanzamiento tiro = new Lanzamiento(distanciaRecorrida, angulo);
					lanzamiento.add(tiro);
				}
				Lanzador lanzador = new Lanzador(i, lanzamiento);
				lanzadores.add(lanzador);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
