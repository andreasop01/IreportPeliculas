/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Tarde
 */
public class Pelicula {
    
    private String nombrePelicula;
    private String genero;
    private boolean vista;
    private String cine;

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula, String genero, boolean vista, String cine) {
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.vista = vista;
        this.cine = cine;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public String getCine() {
        return cine;
    }

    public void setCine(String cine) {
        this.cine = cine;
    }
    
    public String[] toArrayString() {
        String peliculas[] = {this.nombrePelicula,this.genero,this.vista+" " ,this.cine};
        return peliculas;
    }
   
    
    
}
