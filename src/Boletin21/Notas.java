
package Boletin21;

public class Notas {
    
    public int[] ponerNotas(int[] notas){
        
        for(int i = 0; i<notas.length; i++){
            notas[i] = (int) (Math.random()*10);
        }
        return notas;
    }
    
    public int[] visualizarAprobadosSuspensos(int[] notas){
        
        int aprobados=0;
        int suspensos=0;
        
        for(int i = 0; i<notas.length; i++){
            
            if (notas[i]<5){
                aprobados++;
            }
            else{
                suspensos++;
            }     
        }
        
        System.out.println("Numero de aprobados: "+aprobados);
        System.out.println("Numero de suspensos: "+suspensos);
        
        return notas;
    }
    
    public int[] notaMedia(int[] notas){
        
        float media = 0;
        
        for(int i = 0; i<notas.length; i++){            
            media = media + notas[i];            
        }
        
        media = media/notas.length;
        
        System.out.println("Nota media: "+media);
        
        return notas;
    }
    
    public int[] notaMasAlta(int[] notas){
                
        int notamasalta = 0;
        
        for (int i = 0; i<notas.length; i++){        
            if (notas[i]>notamasalta){
                notamasalta = notas[i];
            }
        }
        
        System.out.println("Nota mas alta: "+notamasalta);
        
        return notas;
    }
    
    
}
