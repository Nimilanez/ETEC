/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produto;

/**
 *
 * @author User
 */
public class TestaProd {
public static void main(String a[]){
 String s = "    ";
 Produto produto;
 produto = new Produto( 10, "Sabonete", 12, 1.20);
 System.out.println(produto.codigo + s +
    produto.preco);
 produto.quantidade = 100;
 System.out.println(produto.quantidade + s +
    produto.preco);
 produto.preco *= 1.10;
 System.out.println(produto.quantidade + s +
    produto.preco);       
}    
}
