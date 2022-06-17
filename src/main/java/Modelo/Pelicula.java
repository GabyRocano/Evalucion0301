/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Pelicula {
    private String nombre;
    private int yearEstreno;
    private String genero;
    private String director;

    public Pelicula(String nombre, int yearEstreno, String genero, String director) {
        this.nombre = nombre;
        this.yearEstreno = yearEstreno;
        this.genero = genero;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearEstreno() {
        return yearEstreno;
    }

    public void setYearEstreno(int yearEstreno) {
        this.yearEstreno = yearEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", yearEstreno=" + yearEstreno + ", genero=" + genero + ", director=" + director + '}';
    }
    
    
    
}
