/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janela;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dti
 */
public class Janela extends JFrame {
public Janela(){  // metodo construtor com o mesmo nome da classe
   super("Programação Orientada a Objeto");
        
      
        setSize(450,250);
        
        setVisible (false);
   
        setVisible(true); // para a janela funcionar
        
       setLocationRelativeTo(null);
  } 
    
    public static void main(String args[]){
        Janela app = new Janela();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}