/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3pesoideal;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class principal {
     public static void main(String[] args) {
        double alt, peso;
        String sexo;
        calcularPesoIdeal()
        
       
       double alt = JOptionPane.showInputDialog("Digite sua altura:");
        System.out.println("Informe seu sexo F para Feminino/ M para Masculino:");
        sexo = input.nextLine();
        if (sexo.equals("M")) {
            peso = 72.7 * alt - 58;
            System.out.println("O seu peso ideal é:" + peso);
        } else {
            if (sexo.equals("F")) {
                peso = 62.1 * alt - 44.7;
                System.out.println("O seu peso ideal é:" + peso);
            }
        }
    
}

    private static void calcularPesoIdeal() {
      
    }
}
