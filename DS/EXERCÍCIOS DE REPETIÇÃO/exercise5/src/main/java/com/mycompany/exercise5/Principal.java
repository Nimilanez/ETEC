/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise5;

import java.util.Random;

/**
 *
 * @author User
 */
public class Principal {
 public static void main(String[] args) {      

       char[] vogais = new char[50];

       Random rand = new Random();

       int numVogais = 0;        

       while (numVogais < 50) {

           char letra = (char) (rand.nextInt(26) + 'a');

           if (isVogal(letra)) {

               vogais[numVogais] = letra;

               numVogais++;

           }

       }        

       System.out.print("Vogais aleatórias: ");

       for (char v : vogais) {

           System.out.print(v + " ");

       }        

   }    

   public static boolean isVogal(char letra) {

     return switch (letra) {
         case 'a', 'e', 'i', 'o', 'u' -> true;
         default -> false;
     };

   }    

}   

