/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Caixa {
  // Atributos
    private double saldo;
  

    // Construtor sem parâmetros
    public Caixa() {
        this(0);
    }
    
    // Construtor com parâmetros
    public Caixa(double saldo) {
        this.saldo = saldo;
       
    }
    
    public double getSaldo(){
        return saldo;
        
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void entrar(double valor){
        if(valor>0){
            this.setSaldo(this.getSaldo() + valor);
        }
    }

   public void retirar(double valor) {
       if(valor>0){
            this.setSaldo(this.getSaldo() - valor);
        }
       
    }

    
    
    
}   

