/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.altura;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pesoideal {
  public static double calcularPesoIdeal(char sexo, double altura) {

       if (sexo == 'M' || sexo == 'm') {

           return (72.7 * altura) - 58;

       } else if (sexo == 'F' || sexo == 'f') {

           return (62.1 * altura) - 44.7;

       } else {

           throw new IllegalArgumentException("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");

       }

   }

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite sua altura (em metros):");

       double altura = scanner.nextDouble();

       System.out.println("Digite seu sexo (M para masculino, F para feminino):");

       char sexo = scanner.next().charAt(0);

       double pesoIdeal = calcularPesoIdeal(sexo, altura);

       System.out.printf("O peso ideal para sua altura e sexo é: %.2f kg%n", pesoIdeal);

   }

}