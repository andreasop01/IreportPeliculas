/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class Cine {
    
    private String nombreCine;
    private String direccionCine;
    private ArrayList<Pelicula> listaPelicula;

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getDireccionCine() {
        return direccionCine;
    }

    public void setDireccionCine(String direccionCine) {
        this.direccionCine = direccionCine;
    }

    public ArrayList<Pelicula> getListaPelicula() {
        return listaPelicula;
    }

    public void setListaPelicula(ArrayList<Pelicula> listaPelicula) {
        this.listaPelicula = listaPelicula;
    }

    public Cine(String nombreCine, String direccionCine, ArrayList<Pelicula> listaPelicula) {
        this.nombreCine = nombreCine;
        this.direccionCine = direccionCine;
        this.listaPelicula = listaPelicula;
    }
    public Cine(String nombreCine, String direccionCine) {
        this.nombreCine = nombreCine;
        this.direccionCine = direccionCine;
        this.listaPelicula = new ArrayList<>();
    }

    public Cine() {
    }

    @Override
    public String toString() {
        return "Cine{" + "nombreCine=" + nombreCine + ", direccionCine=" + direccionCine + ", listaPelicula=" + listaPelicula + '}';
    }
    
    
}
