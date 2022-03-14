
package Boletin25.libreria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funciones {
    
    FileWriter fich;
    PrintWriter escribir;
    BufferedWriter bf;    
    Scanner sc;
    
    public void crearLibro(ArrayList<Libro> biblio, File fichero){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        try {
            Libro ejemplar = new Libro();
            System.out.println("Titulo");ejemplar.setNomeLibro(sc.nextLine());
            System.out.println("Autor");ejemplar.setAutor(sc.nextLine());
            System.out.println("Precio");ejemplar.setPrecio(sc.nextFloat());
            System.out.println("Unidades");ejemplar.setUnidades(sc.nextInt());
            biblio.add(ejemplar);                        
            fich = new FileWriter(fichero, true);
            bf = new BufferedWriter(fich);
            bf.write(biblio.get(a).toString());                  
        } catch (IOException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                bf.close();
            } catch (IOException ex) {
                Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void amosar(ArrayList<Libro> biblio, File fichero){
        String libro;    
        try {            
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                libro = sc.nextLine();
                System.out.println(libro); 
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        public ArrayList<Libro> borrar(File fichero){
        ArrayList<Libro> biblio = new ArrayList<Libro>();
        String cadea;
        Libro ejemplar;
        try {            
            sc = new Scanner(fichero);
            while(sc.hasNextLine()){
                cadea = sc.nextLine();
                String[]linea = cadea.split("\\s*,\\s*");
                ejemplar = new Libro(linea[0], linea[1], Float.parseFloat(linea[2]), Integer.parseInt(linea[3]));
                biblio.add(ejemplar);
            }
            for(Libro x:biblio){
                System.out.println(x);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return biblio;
        
//        public ArrayList<Xogador> lerObxectoMeterArray(File fich, String delimitador){
//        String cadea;
//        ArrayList<Xogador>lista = new ArrayList<Xogador>();
//        Xogador xo;
//        try {
//            sc = new Scanner(fich);
//            while(sc.hasNextLine()){
//                cadea = sc.nextLine();
//                String[]linea = cadea.split(delimitador);
//                xo = new Xogador(linea[0], Integer.parseInt(linea[1]));
//                lista.add(xo);
//            }
//            for(Xogador x:lista){
//                System.out.println(x);
//            }
//            
//        } catch (FileNotFoundException ex){
//            System.out.println("Error 2: " + ex.getMessage());
//        }
//        finally{
//            sc.close();
//        }
//        return lista;
//    }
}
        
        
    }
    


    
    
    
    
