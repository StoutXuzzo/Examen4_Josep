/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author stout
 */
public abstract class Arma {
    final static public String grito = "BANG";
    
    public int danyo;
    public int rango;
    
    public Arma (int danyo, int rango){
        this.danyo = danyo;
        this.rango = rango;
    }
    
    public void setDanyo(int danyo){
        this.danyo = danyo;
    }
    public void setRango (int rango){
        this.rango = rango;
    }
    
    public int getDanyo(){
        return danyo;
    }
    public int getRango(){
        return rango;
    }
    
    public String armarse(){
        return grito;
    }
    public abstract void ataque();
    
}
