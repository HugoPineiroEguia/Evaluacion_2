
package Boletin21;

public class Numero {
    
    int[] numeros = new int[6];
    
    public void crearArray(){       
        
        for (int i = 0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*(50-1)+1);
        }
        
    }
    
    public void amosarArray(){
        
        for (int i = numeros.length - 1; i>=0 ; i--){
            System.out.println(numeros[i]);
        }
        
    }
    
    
}
