/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author nganfornina
 */
public class Libro {
    
    private int id ;
    private String titulo;
    private String genero ;
    private String autor ;
    private int copias ;
    private boolean novedad ;

    public Libro(int id, String titulo, String genero, String autor, int copias, boolean novedad) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.copias = copias;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public int getCopias() {
        return copias;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", copias=" + copias + ", novedad=" + novedad + '}';
    }
    
    
    
    
}
