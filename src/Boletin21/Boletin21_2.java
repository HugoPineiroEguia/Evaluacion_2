
package Boletin21;


public class Boletin21_2 {

    public static void main(String[] args) {
        
        int [] notas = new int[30];
        
        Notas obx = new Notas();
        
        obx.ponerNotas(notas);
        obx.visualizarAprobadosSuspensos(notas);
        obx.notaMedia(notas);
        obx.notaMasAlta(notas);
       
    }
    
}
