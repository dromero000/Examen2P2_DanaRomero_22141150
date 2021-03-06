/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_danaromero_22141150;

import java.io.Serializable;
import javax.swing.JOptionPane;


/**
 *
 * @author Dana Romero
 */
public class Terrestre extends Planeta implements Serializable{
    
    
    public Terrestre(String nombre) {
        super(nombre);
    }
    
    public Terrestre (double tamano,double peso, String nombre, double cX, double cY){
        super(tamano,peso,nombre,cX,cY);
    }

    @Override
    public Planeta colision(Planeta planeta2) {
        if(probabilidad(25)){
            String nombreNuevo = JOptionPane.showInputDialog(null, "Ingrese nombre del planeta");
            double pesoNuevo = (this.peso + planeta2.peso) /2;
            double tamanoNuevo = (this.tamano + planeta2.tamano) /2;
            double cXNuevo = (this.cX + planeta2.cX) /2;
            double cYNuevo = (this.cY + planeta2.cY) /2;
            return new Terrestre(tamanoNuevo,pesoNuevo,nombreNuevo,cXNuevo,cYNuevo);
        }else{
            return null;
        }
    }
    

    
    
}
