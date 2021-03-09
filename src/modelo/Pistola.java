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
public class Pistola extends Arma{
    
    public Pistola (){
        super(3, 1);
    }
    
    @Override
    public void ataque(){
        for(int i = 0;i<danyo;i++) System.out.println(" x ");
    }
    // ESTO ES UN COMENTARIO PARA GH
}
