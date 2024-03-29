package ajedrez.piezas;

public class Posicion{
	
	private int fila;
	private int columna;

	public Posicion(int fila, int columna) {
		this.fila = fila; 
		this.columna = columna;
	}

	public int obtenerFila() {
		return fila;
	}

	public int obtenerColumna() {
		return columna; 
	}

	
    
	@Override//para sobreescribir un metodo
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Posicion otra = (Posicion) obj; 
		return fila == otra.fila && columna == otra.columna;
	}

	public String toString(){
		String resultadoPosicion = "("+fila+","+columna+")"; 
		return resultadoPosicion;
	}
		

}