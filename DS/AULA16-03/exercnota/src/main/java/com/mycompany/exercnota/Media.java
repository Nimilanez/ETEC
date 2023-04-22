/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercnota;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Media { //declarar a variável
public static void main(String[] args) // modificador para inserir qualquer classe
{
  double n1 = 0, n2 = 0, n3 = 0, n4 = 0, md = 0;// armazenar números
String des = "";
n1 = Double.parseDouble(JOptionPane.showInputDialog //classe que exibe uma caixa para solicitação de dados pelo usuário
        ("Digite a 1ª ")); // declarador das variáveis
n2 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a 2ª "));// declarador das variáveis
n3 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a 3ª "));//declarador das variáveis  
n4 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a 4ª "));//declarador das variáveis
    //    
    md = (n1+ n2 + n3 + n4)  / 4; //declarando as variáveis e inserindo o sinal para obter o resultado
    //
    if (md >= 6)//alterar o fluxo de execução de um programa em C baseado no valor, verdadeiro ou falso, de uma expressão lógica.
    {
       des = "Aprovado"; //declarando o resultado para a execuçaõ   
    }     
    else if (md < 3)//significa algo mais ou algum outro
    {
        des = "Retido";//declarando o resultado para a execuçaõ
    }
    else //significa algo mais ou algum outro
    {
        des = "Exame"; //declarando o resultado para a execuçaõ 
    }
    //
    JOptionPane.showMessageDialog(null,  "A média é: " + md + "\nSituaçaõ do Aluno: " + des);//exibe uma caixa solicitando a entrada de dados em um usuário de campo e texto
    //e botões OK e Cancel. Ao clicar em OK, o texto digitado pelo usuário é retornado pelo método, e pode ser armazenado em uma variável, por exemplo.
          
   }

   }
