import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import geometria.Punto;
import geometria.Triangulo;
import svg.SVG;

public class PruebaSVG {

    public static void main(String[] args) {
        File archivo = new File("prueba.svg");
        try (FileWriter fw = new FileWriter(archivo);
             BufferedWriter escritor = new BufferedWriter(fw)) {
            SVG svg = new SVG(500, 400);
            svg.agregarTriangulo(new Triangulo(
                    new Punto(110, 20), new Punto(410, 20), new Punto(260, 280)));
            svg.agregarTriangulo(new Triangulo(
                    new Punto(185, 150), new Punto(335, 150), new Punto(260, 20)));
            svg.escribir(escritor);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}