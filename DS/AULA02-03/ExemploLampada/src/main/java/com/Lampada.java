/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class Lampada { //classe principal
  private String estadodaLampada = "apagada";//modificador para inserir a classe

public void acende () { //
    estadodaLampada = "acesa"; //
}
public void apaga() {
    estadodaLampada = "apagada"; //  
}
public void mostraEstado() { //
   if (estadodaLampada.equals("acesa")) { //
       System.out.println("Esta acesa!");
   } else {
       System.out.println("Esta apagada!");
   }
}

}
