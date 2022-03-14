
package Boletin24.boletin24;

import funciones.Funciones;
import funciones.Libros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin24 {

    public static void main(String[] args) {
        
        int opcion;
        boolean UwU = false;
        ArrayList<Libros> biblio = new ArrayList();
        
        Funciones funciones = new Funciones();        
        
        while (UwU==false){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que quieres hacer?\n1. Añadir libro\n2. Mostrar libros\n3. Vender libro\n4. Dar de baja libros sin unidades\n5. Buscar un libro\n6. Salir"));
        switch(opcion){
            case 1:
                funciones.engadirLibros(biblio);                
                break;
            case 2:
                funciones.amosarLibros(biblio);
                break;
            case 3:
                funciones.venderLibros(biblio);
                break;
            case 4:
                funciones.darDeBaixa(biblio);
                break;
            case 5: 
                funciones.buscarLibro(biblio);
                break;
            case 6:
                System.exit(0);
        }
        System.out.println(biblio.size());
        }
    }
    
}
