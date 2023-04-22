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

       Scanner sc = new Scanner(System.in);

       int opcao = 0;

       do {

           System.out.println("Selecione a operação desejada:");

           System.out.println("1 - Soma");

           System.out.println("2 - Subtração");

           System.out.println("3 - Divisão");

           System.out.println("4 - Multiplicação");

           System.out.println("5 - Resto da Divisão");

           System.out.println("6 - Dobro");

           System.out.println("7 - Quadrado");

           System.out.println("8 - Cubo");

           System.out.println("9 - Raiz Quadrada");

           System.out.println("0 - Sair");

           opcao = sc.nextInt();

           switch(opcao) {

               case 1:

                   realizarSoma();

                   break;

               case 2:

                   realizarSubtracao();

                   break;

               case 3:

                   realizarDivisao();

                   break;

               case 4:

                   realizarMultiplicacao();

                   break;

               case 5:

                   realizarRestoDivisao();

                   break;

               case 6:

                   realizarDobro();

                   break;

               case 7:

                   realizarQuadrado();

                   break;

               case 8:

                   realizarCubo();

                   break;

               case 9:

                   realizarRaizQuadrada();

                   break;

               case 0:

                   System.out.println("Saindo...");

                   break;

               default:

                   System.out.println("Opção inválida!");

                   break;

           }

       } while(opcao != 0);

       sc.close();

   }

   public static void realizarSoma() {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o primeiro número: ");

       double num1 = sc.nextDouble();

       System.out.println("Informe o segundo número: ");

       double num2 = sc.nextDouble();

       double resultado = num1 + num2;

       System.out.println("Resultado: " + resultado);

   }

   public static void realizarSubtracao() {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o primeiro número: ");

       double num1 = sc.nextDouble();

       System.out.println("Informe o segundo número: ");

       double num2 = sc.nextDouble();

       double resultado = num1 - num2;

       System.out.println("Resultado: " + resultado);

   }

   public static void realizarDivisao() {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o primeiro número: ");

       double num1 = sc.nextDouble();

       System.out.println("Informe o segundo número: ");

       double num2 = sc.nextDouble();

       if(num2 == 0) {

           System.out.println("Não é possível realizar divisão por zero!");

           return;

       }

       double resultado = num1 / num2;

       System.out.println("Resultado: " + resultado);

   }

   public static void realizarMultiplicacao() {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o primeiro número: ");

       double num1 = sc.nextDouble();

       System.out.println("Informe o segundo número: ");

       double num2 = sc.nextDouble();

       double resultado = num1 * num2;

       System.out.println("Resultado: " + resultado);

   }

   public static void realizarRestoDivisao() {

       Scanner sc = new Scanner(System.in);

       System.out.println("Informe o primeiro número: ");

       int num1 = sc.nextInt();