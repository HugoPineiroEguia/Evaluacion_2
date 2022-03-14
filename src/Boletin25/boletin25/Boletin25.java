
package Boletin25.boletin25;

import java.io.File;
import java.util.ArrayList;
import libreria.Funciones;
import libreria.Libro;

public class Boletin25 {

    public static void main(String[] args) {
        
        ArrayList<Libro> biblioteca = new ArrayList();       
        
        Funciones a = new Funciones();
        File fichero = new File("Libreria.txt");
        a.crearLibro(biblioteca, fichero);
        a.amosar(biblioteca, fichero);
        a.borrar(fichero);
        
    }    
}
