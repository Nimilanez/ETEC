/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nota;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lernota {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       String nome;

       double nota1, nota2, media;

       System.out.println("Digite o nome do aluno:");

       nome = sc.nextLine();

       nota1 = lerNota("Digite a primeira nota:");

       nota2 = lerNota("Digite a segunda nota:");

       media = calcularMedia(nota1, nota2);

       System.out.printf("Média do aluno %s é: %.2f\n", nome, media);

       if (media >= 7.0) {

           System.out.println("Aluno aprovado!");

       } else {

           System.out.println("Aluno reprovado!");

       }

       sc.close();

   }

   public static double lerNota(String mensagem) {

       Scanner sc = new Scanner(System.in);

       System.out.println(mensagem);

       return sc.nextDouble();

   }

   public static double calcularMedia(double nota1, double nota2) {

       return (nota1 + nota2) / 2;

   }

}  

