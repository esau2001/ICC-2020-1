package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
        datos = new double [m] [n]; 
        
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        double e = datos[i][j];
        return e;
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        datos [i][j] = dato;
        
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
        if (datos.length != otra.datos.length|| datos[0].length != otra.datos[0].length){
            return null;
        }else{
        Matriz suma = new Matriz (datos.length, datos[0].length);
        for( int i = 0; i < datos.length; i++){
            for (int j = 0; j < datos[0].length; j++){
                suma.datos[i][j] = otra.datos[i][j] + datos[i][j];
            }
        }
        return suma;
    }
}
       

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
        Matriz escalar = new Matriz (datos.length, datos[0].length);
        for (int i = 0; i < escalar.datos.length; i++){
            for( int j = 0; j < escalar.datos[0].length; j++){
                    escalar.datos[i][j] = this.datos[i][j] * c;
            }
        }
        return escalar;
      
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        //Matriz nueva = new Matriz ();
        //nueva.datos =
         if (k < 0 || k >= datos.length) {
            return null;
        }
        Matriz eliminarFila = new Matriz(datos.length - 1, datos[0].length);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if (i != k) {
                    if (i > k) {
                        eliminarFila.datos[i - 1][j] = this.datos[i][j];
                    } else {
                        eliminarFila.datos[i][j] = this.datos[i][j];
                    }
                }
            }
        }
        return eliminarFila;
    }


       
    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
        if (k < 0 || k >= datos[0].length) {
            return null;
        }
        Matriz eliminarColumna = new Matriz(datos.length, datos[0].length - 1);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if (j != k) {
                    if (j > k) {
                        eliminarColumna.datos[i][j - 1] = this.datos[i][j];
                    } else {
                        eliminarColumna.datos[i][j] = this.datos[i][j];
                    }
                }
            }
        }
        return eliminarColumna;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
             if (datos.length == 2) {
             return (this.datos[0][0] * this.datos[1][1]) - (this.datos[0][1] * this.datos[1][0]);
        }
        double d = 0;
        Matriz aux;
        for (int i = 0; i < datos.length; i++) {
            aux = this.eliminarFila(i).eliminarColumna(0);

            d += Math.pow(-1, i + 1) * this.datos[i][0] * aux.determinante();
        }
        return d;
     }

    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
           String matriz = new String();
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                matriz += this.datos[i][j] + " ";
                }
            matriz += "\n";
        }
        return matriz;
    }


    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
        return false;
    }
        Matriz otra = (Matriz) obj;
        if (m != otra.m || n != otra.n){
            return false;
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (datos [i] [j] != otra.datos [i] [j]){
                    return false;
                }
            }
        }
        return true;
    }
}