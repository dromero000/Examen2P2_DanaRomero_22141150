/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_danaromero_22141150;

import java.util.Random;

/**
 *
 * @author Dana Romero
 */
public class Planeta {
    
    static Random r = new Random();
    //Atributos
    protected String nombre;
    protected double tamano, peso, cX, cY;
    
    //Constructor

    public Planeta(String nombre) {
        this.nombre = nombre;
    }
    

    
    public boolean probabilidad(int porcentaje){
        int num = r.nextInt(100);
        return num<=porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getcX() {
        return cX;
    }

    public void setcX(double cX) {
        this.cX = cX;
    }

    public double getcY() {
        return cY;
    }

    public void setcY(double cY) {
        this.cY = cY;
    }
    
    
    
    
    
}
