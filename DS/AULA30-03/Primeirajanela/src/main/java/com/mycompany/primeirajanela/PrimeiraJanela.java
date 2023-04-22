/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirajanela;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame{
  public PrimeiraJanela(){
        super("Nossa primeira janela");
        // definir um icone para janela
        ImageIcon icone = new ImageIcon("teste.gif");
        setIconImage(icone.getImage());
       
        setSize(300,150);
   
        setVisible(true);//para funcionar a janela
        //Container tela = getContentPane();
        //tela.setBackground (new Color(0,0 0,)); // está definindo a cor de fundo para a janela *da para usar as cores rbd pelo "(new Color(2255,128,128));"
        //setExtendedState(INCONFIED);// janela maximizada
        //setExtensedState(MAXIMIZED_BOTH;// janela maximizada
        //serResizable(false); não consegue redimensionar o tamanho da janela
  } 
    
    public static void main(String args[]){
        PrimeiraJanela app = new PrimeiraJanela();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
   

