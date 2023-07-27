/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoradiagramadeclasses;
/**
 *
 * @author Admin
 */
public class MenuCalculadora {
private Calculadora calculadora;
private int opcao;
private ConversorNumeros conversor;
private EntradaSaidaDados io;

public MenuCalculadora (){
    this.calculadora = new Calculadora();
    this.opcao = -1;
    this.conversor = new ConversorNumeros();
    this.io = new EntradaSaidaDados();
}
public void executarCalculadora(){
 do{
     this.executarMenuPrincipal();
     this.avaliarOpcaoEscolhida();
 }while(this.opcao!=0);
 } 
private void executarMenuPrincipal();
String mensagemMenu = "Selecione uma opção"
        +"\n 1 - Somar"
        +"\n 2 - Sbtrair"
        +"\n 3 - Multiplicar"
        +"\n 4 - Dividir"
        +"\n 5 - Sair";
 String entradaDados = io.entradaDados (mensagemMenu);
 this.opcao = conversor.StringToInt (entraDados);
}
public void avaliarOpcaoEscolhida() {  
String saida;
 double num1=0, num2=0;
 if(this.opcao != 0 && this.opcao<=4){
String mensagemEntrada
        }
}
