/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
 public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int[] qtd = new int[100];

       double[] preco = new double[100];

       double faturamento = 0.0;


       for (int i = 0; i < 100; i++) {

           System.out.println("Insira a quantidade da mercadoria " + (i + 1) + ":");

           qtd[i] = sc.nextInt();

           System.out.println("Insira o preço da mercadoria " + (i + 1) + ":");

           preco[i] = sc.nextDouble();

       }


       for (int i = 0; i < 100; i++) {

           faturamento += preco[i] * qtd[i];

       }


       System.out.println("O faturamento mensal é: " + faturamento);

   }

}   

