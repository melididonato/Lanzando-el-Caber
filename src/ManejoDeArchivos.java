import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ManejoDeArchivos {

	public static void main(String[] args) {
		ArrayList<Lanzador> lanzadores = new ArrayList<Lanzador>();
		String path = "Archivo2.txt";
		leerArchivo(path, lanzadores);
		Competencia competencia = new Competencia(lanzadores);
		competencia.generarPodioConsistencia();
		competencia.generarPodioDistancia();
		System.out.println();
		String pathSalida = "Archivo2.out";
		generarArchivo(pathSalida, competencia);
	}

	public static void leerArchivo(String path, ArrayList<Lanzador> lanzadores) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			double distanciaRecorrida, angulo;
			linea = br.readLine();
			int cantidadLanzadores = Integer.parseInt(linea);
			for (int i = 1; i <= cantidadLanzadores; i++) {
				ArrayList<Lanzamiento> lanzamiento = new ArrayList<Lanzamiento>();
				for (int j = 1; j <= 3 ; j++) {
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
	
	public static void generarArchivo(String path, Competencia competencia) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			File archivo = new File(path);
			if(!archivo.exists()) {
				archivo.createNewFile();
			}
			fw = new FileWriter(archivo);
			pw = new PrintWriter(fw);
			if(competencia.getPodioConsistencia().primerPuesto != 0)
				pw.print(competencia.getPodioConsistencia().primerPuesto+" ");
			if(competencia.getPodioConsistencia().segundoPuesto != 0)
				pw.print(competencia.getPodioConsistencia().segundoPuesto+" ");
			if(competencia.getPodioConsistencia().tercerPuesto != 0)
				pw.print(competencia.getPodioConsistencia().tercerPuesto);
			pw.println();
			if(competencia.getPodioDistancia().primerPuesto != 0)
				pw.print(competencia.getPodioDistancia().primerPuesto+" ");
			if(competencia.getPodioDistancia().segundoPuesto != 0)
				pw.print(competencia.getPodioDistancia().segundoPuesto+" ");
			if(competencia.getPodioDistancia().tercerPuesto != 0)
				pw.print(competencia.getPodioDistancia().tercerPuesto+" ");
		} catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(null!=fw)
					fw.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
