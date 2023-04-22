/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janela02;

import java.awt.Color;
import java.awt.Container;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dti
 */
public class janela_01 extends JFrame {
   public janela_01(){ // metodo construtor com o mesmo nome da classe
        super("Exercício02");
        Container tela = getContentPane();
      tela.setBackground(new Color(125,125,125));
      ImageIcon icone = new ImageIcon("Smile.png");
      setIconImage(icone.getImage());
        setSize(400,200);
       setVisible(true); // para a janela funcionar
     setExtendedState(MAXIMIZED_BOTH);
       
  } 
    
    public static void main(String args[]){
        janela_01 app = new janela_01();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}   
  

