/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ErrorException;

/**
 *
 * @author stout
 */
public class Superviviente implements Rol{
    private int vidas;
    private int nivel;
    private String nombre;
    final private String skill;
    private Arma arma;
    private int resistencia;

    public Superviviente(int vidas, int nivel, String nombre, String skill) throws ErrorException{
        this.vidas = vidas;
        this.nivel = nivel;
        this.nombre = nombre;
        this.arma = arma;
        this.skill = skill;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVidas() {
        return vidas;
    }
    public int getNivel() {
        return nivel;
    }
    public String getNombre () {
        return nombre;
    }
    public String getSkill() {
        return skill;
    }
    public Arma getArma() {
        return arma;
    }
    public int getResistencia (){
        return resistencia;
    }
    
    public boolean tieneArma(){
        return (arma == null)?false:true;
    }
    public void deleteArma(){
        arma = null;
    }
    
    public String info(){
        return nombre + " - Nivel: " + nivel + " - Vidas: " + vidas + " - Skill: " + skill;
    }
}
