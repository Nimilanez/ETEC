/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplolampada;

/**
 *
 * @author Admin
 */
public class Lampada {
    private String estadoDaLampada = "apagada";
    
    public void acende() { 
        estadoDaLampada = "acesa";
    }
    public void apaga(){
        estadoDaLampada = "apagada";
        
    }
    public void mostraEstado (){
        if (estadoDaLampada.equals("acesa")){ 
            System.out.println("Está acesa!");
        } else {
            System.out.println("Está apagada");
        }
    }
    
    
}

