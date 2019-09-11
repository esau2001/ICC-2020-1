/**
 *Clase Lector en la que defina sus atributos y los métodos de modificación y acceso de dichos atributos.  
 *@author Esau Martínez Pardo 
 *@version 1.0 
 */
public class Libro{  // Encabezado, crear la clase Libro 

	private String titulo; // Crear atributo
	private String autor;  //Crear atributo
        private String añoPub; // Crear atributo 

/**
 * Constructor default.
 *@param (0, "", etc.)
 */
	public Libro() {


titulo = " "; 
autor = " ";
añoPub = " ";



}  

  
/**
 * Contructor con parámetros que inicialicen los atributos a los valores de dichos paramétros 
 * @param (10) 
 */

	public Libro () {

titulo = " ";
autor = " ";
añoPub = " "; 

 
}



/**
 * Método para asignar nuevos valores a titulo  
 * @param nuevoTitulo-nuevo valor a titulo 
 */

	public void asignarTitulo (String nuevoTitulo) {

	titulo = nuevoTitulo; 
}

/**
 * Método para asignar nuevos valores a autor 
 * @param nuevoAutor-nuevo valor a autor
 */

	public void asignarAutor (String nuevoAutor) {
	
	autor = nuevoAutor;
 }

/**
 * Método para asignar nuevos valores a añoPub
 * @param nuevoAutor-nuevo valor a añoPub
 */

	public void asignarAño (String nuevoAño) {

	añoPub = nuevoAño;
 }

/** Método para obtener el valor de titulo
 * @return String - el valor de titulo
 */

	public String obtenerAño () {
           return año;
 }

/** Método para obtener el valor de autor
 * @return String - el valor de autor 
 */


	public String obtenerAutor () {
           return autor; 
 }


/** Método para obtener el valor de añoPub
 * @return String - el valor del año de publicacion
 */


	public String obtenerAño () {
           return añoPub;
 }







}

