package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;

public class PruebaPeon {
	public static void main(String[] args) {
		Peon peon = new Peon (Color.BLANCO, Posicion(1,3));
		

		List<Posicion>posiciones=
		peon.obtenerJugadasLegales();
		for (int i = 0; i<posiciones.size(); i++){
			int fila = posiciones.get(i).obtenerFila();
		}
		for (int j = 0; j<posiciones.size(); j++){
			int columna = posiciones.get(j).obtenerColumna(); 
		}


		System.out.println ("La posicion del peon blanco es:"+fila+columna);

		
   }

}