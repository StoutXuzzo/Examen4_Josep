/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import vista.*;
import modelo.*;
/**
 *
 * @author stout
 */
public class Refugio {
    private static int pistolas = 0;
    private static ArrayList<Superviviente> supervivientes = new ArrayList<Superviviente>(); 
    private int pistorlas = 0;
    final private static String[][] skillList = new String[][]{{"RAPIDO", "BUSCADOR", "FORTACHON", "AMBIDIESTRO", "ESCURRIDIZO"},{"5", "3", "7", "8", "9"}};
    
    
    public static void addSuperviviente(int vidas, int nivel, String nombre, String skill, String arma) throws ErrorException{
        Superviviente superviviente = new Superviviente(vidas, nivel, nombre, skill);

        for ( int i = 0;i < skillList[0].length; i++ ){
            if (skillList[0][i].equals(superviviente.getSkill())){
                superviviente.setResistencia(Integer.parseInt(skillList[1][i]));
                break;
            }
            if(i == skillList[0].length-1){
                throw new ErrorException("La skill no es correcta");
            }
        }
        
        switch (arma){
            case "":
                break;
            case "PISTOLA":
                if(pistolas != 2){
                    Pistola pistola = new Pistola();
                    superviviente.setArma(pistola);
                    pistolas++;
                    break;
                }else throw new ErrorException("Ya no quedan pistolas");
                
            case "ESCOPETA":
                Escopeta escopeta = new Escopeta();
                superviviente.setArma(escopeta);
                break;
            default:
                throw new ErrorException("El arma no existe");
        }
        
        supervivientes.add(superviviente);
        
        System.out.println(superviviente.getArma().armarse());
        superviviente.getArma().ataque();
    }
    
    public static ArrayList<Superviviente> getSupervivientes(){
        return supervivientes;
    }
}
