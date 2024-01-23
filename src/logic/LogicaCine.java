/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dto.Cine;
import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class LogicaCine {
    private static ArrayList<Cine> listacine=new ArrayList<>();

    public static ArrayList<Cine> getListacine() {
        return listacine;
    }

    public static void setListacine(ArrayList<Cine> listacine) {
        LogicaCine.listacine = listacine;
    }
    
    
}
