/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pelicula;
import Servicio.PeliculaServicio;
import java.util.List;

/**
 *
 * @author HP
 */
public class PeliculaControl {
    
    private final PeliculaServicio peliculaServicio=new PeliculaServicio();
    
    public Pelicula crearPelicula(String [] params){
        var pelicula= new Pelicula(params[0],Integer.parseInt(params[1]),params[2],params[3]);
        this.peliculaServicio.crear(pelicula);
        return pelicula;
        
    }
    
    public List<Pelicula> listarPelicula(){
        return this.peliculaServicio.listar();
    }
    
}
