/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
 public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);

   int[] nums = new int[10];

   int[] fatores = new int[10];


   // Receber 10 números

   System.out.println("Digite 10 números: ");

   for (int i = 0; i < nums.length; i++) {

     nums[i] = scan.nextInt();

   }


   // Calcular o fatorial de cada número e armazenar em um vetor

   for (int i = 0; i < nums.length; i++) {

     int fatorial = 1;

     for (int j = 1; j <= nums[i]; j++) {

       fatorial *= j;

     }

     fatores[i] = fatorial;

   }


   // Mostrar todos os valores

   System.out.println("Fatores: ");

   for (int i = 0; i < fatores.length; i++) {

     System.out.println(fatores[i]);

   }

 }

}   

