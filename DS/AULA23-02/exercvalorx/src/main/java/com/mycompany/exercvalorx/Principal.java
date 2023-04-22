/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercvalorx;

/**
 *
 * @author User
 */
public class Principal {
 public static void main(String[] args) {

int anoNasc = 1990; // Substitua pelo ano de nascimento desejado

int anoAtual = java.time.Year.now().getValue();

int idadeAtual = anoAtual - anoNasc;

System.out.println("Sua idade atual é: " + idadeAtual);

int idadeRef = 2050 - anoNasc;

System.out.println("Em 2050, você terá " + idadeRef + " anos.");

}

}   

