package geometria;

/**
  *Representa un polígono de tres lados. Está definido por
  *tres puntos en el plano cartesiano. 
  */

public class Triangulo {

        public static final int EQUILATERO = 0;
	public static final int ISOSCELES = 1;
	public static final int ESCALENO = 2;

	private Punto a; 
	private Punto b;
	private Punto c;

/**
  * Constructor por omisión 
  */

	public Triangulo() {

	a = new Punto (0,0);
	b = new Punto (1,0);
	c = new Punto (0.5,Math.sin (Math.PI/3));

 }


/** 
  * Constructor con parámetros 
  *@param Puto a, Punto b, Punto c
  */

	public Triangulo(Punto a,
                         Punto b,
                         Punto c){

	this.a = a;
	this.b = b;
	this.c = c;

}


/** 
  * Constructor para saber que mis vertices del triángulo están alineados 
  * @return si están alineados los vertices 
  */
	public boolean tieneVerticesAlineados() {
        return a.estanAlineados (b, c); 
	

}


/**
  *Contructor para saber los tipos de triángulos
  *@param las distanciasAB, distanciaBC, distancia AC
  *@return el tipo de triángulo
  */


	public int tipo(){

	double distanciaAB = a.distancia(b);
	double distanciaBC = b.distancia(c);
	double distanciaAC = a.distancia(c);
	
	
	if (distanciaAB==distanciaBC&&distanciaBC==distanciaAC){
        return EQUILATERO;
        
	}
         
        
	
	

	if (distanciaAB==distanciaBC || distanciaBC==distanciaAC || distanciaAB==distanciaAC){
	return ISOSCELES;

        }
	
        
	return ESCALENO;


 
  
}
	public Punto geta(){
	return a;
	}
        public Punto getb(){
	return b;
	}
	public Punto getc(){
	return c; 
	}

}
