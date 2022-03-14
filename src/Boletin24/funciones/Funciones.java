
package Boletin24.funciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Funciones {
    
       
    
    public void engadirLibros(ArrayList<Libros> biblio){
        
        Libros ejemplar = new Libros("Titulo", "Autor", "ISBN", 0f, 0);
        
        ejemplar.setTitulo(JOptionPane.showInputDialog("Introduce el titulo del libro")) ;
        ejemplar.setAutor(JOptionPane.showInputDialog("Introduce el autor del libro"));
        ejemplar.setIsbn(JOptionPane.showInputDialog("Introduce el ISBN del libro"));
        ejemplar.setPrezo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro")));
        ejemplar.setNumeroUnidades(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades que hay de este libro")));        
        
        biblio.add(ejemplar);       
    }
    
    public void amosarLibros(ArrayList<Libros> biblio){
        
        for (int i = 0; i<biblio.size(); i++){
            JOptionPane.showMessageDialog(null, biblio.get(i).toString());
        }
        
        
    }
    
    public void venderLibros (ArrayList<Libros> biblio){
        
        String libroVendido;
        libroVendido = JOptionPane.showInputDialog("¿Que libro quieres vender?");
        
        for(int i=0; i<biblio.size(); i++){
            
            if (libroVendido.equals(biblio.get(i).getTitulo())){
                biblio.remove(i);
                JOptionPane.showMessageDialog(null, "Libro vendido");
            }          
            
        }
        
    }
    
    public void darDeBaixa (ArrayList<Libros> biblio){
        
        int contador=0;
        
        for (int i = 0; i<biblio.size(); i++){
            if (biblio.get(i).getNumeroUnidades() < 1){
                biblio.remove(i);
                contador++;
            }
        }
        
         JOptionPane.showMessageDialog(null, "Libros dados de baja: "+contador);
        
    }
    
    public void buscarLibro (ArrayList<Libros> biblio){
        
        String libroBusqueda;
        libroBusqueda = JOptionPane.showInputDialog("¿Que libro quieres buscar?");
        
        for(int i=0; i<biblio.size(); i++){
            
            if (libroBusqueda.equals(biblio.get(i).getTitulo())){               
                JOptionPane.showMessageDialog(null, biblio.get(i).toString());
            }
                       
        }
        
    }
    
    
    
    
    
    
}