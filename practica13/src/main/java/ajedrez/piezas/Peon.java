package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {

   public Peon (Color color, Posicion posicion) {
   super(color, posicion);
   }

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
		    columna = obtenerPosicion().obtenerColumna();
		Color color = obtenerColor();

		if (color == Color.NEGRO){
		    if(fila +1 <= 7){
		    	jugadas.add(new Posicion (fila + 1, columna));
		    }
		    if (fila + 1 <= 7 && columna + 1 <= 7){
		    	jugadas.add(new Posicion(fila + 1, columna + 1));
		    }
		    if (fila + 1 <= 7 && columna - 1 >= 0) {
		    	jugadas.add(new Posicion(fila + 1, columna - 1));
		    }
		    
		   }
		    
  

        if (color == Color.BLANCO){
            if(fila -1 >= 0){
		    	jugadas.add(new Posicion (fila - 1, columna));
		    }
		    if (fila -1 >= 0 && columna + 1 <=7){
		    	jugadas.add(new Posicion(fila - 1, columna + 1));
		    }
		    if (fila - 1 >= 0 && columna -1 >= 0) {
		    	jugadas.add(new Posicion(fila - 1, columna - 1));
		    }
		    }
		    
		    return jugadas;
        }
       

	}
