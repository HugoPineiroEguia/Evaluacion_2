
package Boletin23;

public class Ejercicios {
    
    public void ejercicio1 (String cadena){        
        System.out.println("Esta frase tiene " + cadena.length() + " caracteres.");        
    }
    
    public void ejercicio2 (String palabra){
        
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i<caracteres.length; i++){
            System.out.print(caracteres[i]+" ");
        }
        
    }
    
    public void ejercicio3 (String frase){
        
        StringBuilder esarf = new StringBuilder(frase);
        frase = esarf.reverse().toString();
        System.out.println(frase);
        
    }
    
    public void ejercicio4 (String espacio){
        
        System.out.println(espacio.replaceAll("\\s+","")); 
        
    }
    
    public void ejercicio5 (String vocales){
        
        
        
    }
    
}
