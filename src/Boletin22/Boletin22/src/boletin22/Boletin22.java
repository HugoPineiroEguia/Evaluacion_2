
package Boletin22.Boletin22.src.boletin22;

public class Boletin22 {

    public static void main(String[] args) {
        
        int[][] goles = new int[20][36];
        
        Tabla gol = new Tabla();
        gol.crearGoles(goles);
        gol.amosarGoles(goles);
                
      
    }
    
}
