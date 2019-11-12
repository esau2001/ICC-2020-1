package practica14;

import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Paths;
import java.util.List;
import java.util.LInkedList; 

public class LectorCSV {
	public static List<String[]> leer(String ruta) throws IOException {
		List<String> lineas = Files.readAllLines(Paths.get(ruta));

		for (String linea : lineas) {
			if (!linea.isBlank ()) {
				System.out.println ("\""+linea+"\"" + " " + f (linea.split(",")));
				String[] guardado = linea.split(",");
				for (int i = 0; i < guardado.length; i++) {
					guardado[i] = guardado[i].trim(); 
				}
				regresa.add(guardado);
			}
		}
		return regresa;
	}

	public static String f (String[] xs) {
		String variable = "[";
		for (int i = 0; i< xs.length; i ++) {
			variable += (i != xs.length-1) ? xs [i] + "," : xs[i];		
		}
		return variable + "]"; 
	}
}

