
package Boletin22.Boletin22.src.boletin22;

public class Tabla {
    
    
    
    public void crearGoles(int[][] goles){
        
        for (int i =0; i<goles.length; i++){
            for (int j = 0; j<goles[i].length; j++){
                goles[i][j]= (int)(Math.random()*(50));
            }
        }
            
    }
    
    public void amosarGoles(int[][] goles){
       for (int i =0; i<goles.length; i++){
            for (int j = 0; j<goles[i].length; j++){
                System.out.print(goles[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
