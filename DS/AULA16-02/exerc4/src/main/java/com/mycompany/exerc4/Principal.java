/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc4;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int count = 0;
     System.out.println("Digite vários números, e digite 0 para parar:");
     while (true) {
        int numero = sc.nextInt();
        if (numero == 0) {
           break;
        }
        if (numero >= 100 && numero <= 200) {
           count++;
        }
     }
     System.out.println("Foram digitados " + count + " números entre 100 e 200.");
  }
}   

