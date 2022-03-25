/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_danaromero_22141150;

import java.util.ArrayList;

/**
 *
 * @author Dana Romero
 */
public class Cientifico {
    
    //Atributos
    protected String nombreCientifico;
    static ArrayList <Planeta> listaPlanetas = new ArrayList<>();

    //Constructor

    public Cientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
    
    
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public static ArrayList<Planeta> getListaPlanetas() {
        return listaPlanetas;
    }

    public static void setListaPlanetas(ArrayList<Planeta> listaPlanetas) {
        Cientifico.listaPlanetas = listaPlanetas;
    }
    
    
    
}
