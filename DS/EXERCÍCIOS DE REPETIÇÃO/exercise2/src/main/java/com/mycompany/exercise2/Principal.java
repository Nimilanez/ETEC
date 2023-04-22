/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int[] vetor = new int[10];

int quantidadePares = 0;

int quantidadeImpares = 0;

// Carregando o vetor com os números inteiros

   for (int i = 0; i < vetor.length; i++) {

       System.out.print("Digite o número inteiro " + (i + 1) + ": ");

       vetor[i] = scanner.nextInt();

   }


   // Calculando a quantidade de números pares e impares

   for (int i = 0; i < vetor.length; i++) {

       if (vetor[i] % 2 == 0) {

           quantidadePares++;

       } else {

           quantidadeImpares++;

       }

   }


   // Exibindo o resultado

   System.out.println("Quantidade de números pares: " + quantidadePares);

   System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

}

}


