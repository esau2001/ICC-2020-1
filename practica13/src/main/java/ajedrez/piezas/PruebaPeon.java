package ajedrez.piezas;
import java.util.List;
import java.util.LinkedList;

public class PruebaPeon {
	public static void main(String[] args) {
		Peon peon = new Peon (Color.BLANCO, new Posicion(1,3));
		System.out.println (peon.obtenerJugadasLegales());


		
   }

}