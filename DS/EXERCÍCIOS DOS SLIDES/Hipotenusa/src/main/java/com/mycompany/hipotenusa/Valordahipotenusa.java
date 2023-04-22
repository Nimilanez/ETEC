/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Valordahipotenusa {
 public static double calcularHipotenusa(double base, double altura) {

       return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

   }

  public static void main(String[] args) {

 Scanner entrada = new Scanner(System.in);

 System.out.print("Digite o tamanho da base: ");

 double base = entrada.nextDouble();

 System.out.print("Digite o tamanho da altura: ");

 double altura = entrada.nextDouble();

 System.out.println("A hipotenusa é : "+Hipotenusa(base,altura));

}

public static double Hipotenusa(double Base,double Altura){

 double hipotenusa = (Base*Base) + (Altura*Altura);

 hipotenusa = Math.sqrt(hipotenusa);

 return hipotenusa;

}

}