/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_danaromero_22141150;

/**
 *
 * @author Dana Romero
 */
public class Gaseoso extends Planeta{
    
    public Gaseoso(String nombre) {
        super(nombre);
    }
    
    public Gaseoso (double tamano,double peso, String nombre, double cX, double cY){
        super(tamano,peso,nombre,cX,cY);
    }
    @Override
    public Planeta colision(String nombre, Planeta planeta2) {
        if(probabilidad(25)){
            double pesoNuevo = (this.peso + planeta2.peso) /2;
            double tamanoNuevo = (this.tamano + planeta2.tamano) /2;
            double cXNuevo = (this.cX + planeta2.cX) /2;
            double cYNuevo = (this.cY + planeta2.cY) /2;
            return new Gaseoso(tamanoNuevo,pesoNuevo,nombre,cXNuevo,cYNuevo);
        }else{
            return null;
        }
    }
    
    
}
