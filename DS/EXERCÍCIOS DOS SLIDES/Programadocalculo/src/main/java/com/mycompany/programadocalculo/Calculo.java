/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programadocalculo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculo {
    public static void main(String[] args) {
        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escolha a sua operação [+ - * / ]: ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.print("Entre o o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre  o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
        

    }
}
