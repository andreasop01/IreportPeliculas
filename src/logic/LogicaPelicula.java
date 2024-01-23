/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dto.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class LogicaPelicula {
     private static ArrayList<Pelicula> peli = new ArrayList<>();
    
    public static void newPeli(Pelicula p){
        peli.add(p);
    }
    
    public static ArrayList<Pelicula> getPelicula(){
        return peli;
    }
    
    
}
