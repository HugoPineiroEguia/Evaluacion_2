
package Boletin24.funciones;

import java.util.ArrayList;

public class Libros {
    
    String titulo;
    String autor;
    String isbn;
    float prezo;
    int numeroUnidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String isbn, float prezo, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "Libros: " + "Titulo: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Prezo: " + prezo + ", Numero de unidades: " + numeroUnidades;
    }

    String setTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
