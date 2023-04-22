/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.valordiferenca;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Diferenca {
public static double diferenca(double valor1,double valor2) {
    
    return Math.abs(valor1-valor2);
}
public static void main(String[] args) {
    Scanner scanner = new
        Scanner(System.in);
    System.out.println("Digite o primeiro valor real:");
    
    double valor1 =
    scanner.nextDouble();
    
    System.out.println("Digite o segundo valor real:");
    
    double valor2 =
    scanner.nextDouble();
    
    double resultado = diferenca(valor1,valor2);{
}
    
     System.out.println("A diferença entre os dois valores é: " + resultado);
    
}
}
