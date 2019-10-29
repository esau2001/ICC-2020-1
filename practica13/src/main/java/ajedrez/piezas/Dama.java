package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;
import ajedrez.Tablero; 

public class Dama extends Pieza {

   public Dama (Color color, Posicion posicion) {
   super(color, posicion);
   }

	@Override
	public List<Posicion> obtenerJugadasLegales() {
		LinkedList<Posicion> jugadas = new LinkedList<>();
		int fila = obtenerPosicion().obtenerFila(),
		    columna = obtenerPosicion().obtenerColumna();
		Color color = obtenerColor();
		Tablero tab = Tablero.obtenerInstancia();

		//diagonal izquierda
		for (int i = fila -1, j= columna -1; i>=0 && j>=0; i--, j--){
			Pieza p = tab.obtenerPieza (i, j);
			if (p == null){
				jugadas.add(new Posicion (i, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, j));
				}
				break;
			}
			

		}

		//diagonal derecha
		for (int i = fila - 1, j = columna +1; i<=7 && j<=7; i--, j++){
			Pieza p = tab.obtenerPieza (i, j);
			if (p == null){
				jugadas.add(new Posicion (i, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, j));
				}
				break;
			}

		}


		//izquierda
		for (int j = columna - 1; j>=0; j--){
			Pieza p = tab.obtenerPieza (fila, j);
			if (p == null){
				jugadas.add(new Posicion (fila, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (fila, j));
				}
				break;
			}

		}

		//derecha
		for	(int j = columna + 1; j<=7; j++){
			Pieza p = tab.obtenerPieza (fila, j);
			if (p == null){
				jugadas.add(new Posicion (fila, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (fila, j));
				}
				break;
			}

		}

		//centro
		for (int i = fila - 1; i<=7; i--){
			Pieza p = tab.obtenerPieza (i, columna);
			if (p == null){
				jugadas.add(new Posicion (i, columna));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, columna));
				}
				break;

			}

		} 

		//diagonal superior izquierda
		for (int i = fila + 1, j = columna - 1; i>=0 && j>=0; i++, j--){
			Pieza p = tab.obtenerPieza (i, j);
			if (p == null){
				jugadas.add(new Posicion (i, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, j));
				}
				break;

			}

		} 



		//diagonal superior derecha
		for (int i = fila + 1, j = columna + 1; i<=7 && j<=7; i++, j++){
				Pieza p = tab.obtenerPieza (i, j);
			if (p == null){
				jugadas.add(new Posicion (i, j));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, j));
				}
				break;

			}

		} 



		//centro superior
		for (int i = fila +1; i<=7; i++){
					Pieza p = tab.obtenerPieza (i, columna);
			if (p == null){
				jugadas.add(new Posicion (i, columna));
			}else{
				if (p.obtenerColor() != obtenerColor()){
					jugadas.add(new Posicion (i, columna));
				}
				break;

			}

		} 
		return jugadas; 

	}

}

