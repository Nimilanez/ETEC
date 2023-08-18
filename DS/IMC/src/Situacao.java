
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Situacao {
public void verificarSituacao(double imc) {
if (imc < 18.5) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Magreza");
} else if (imc >= 18.5 && imc <= 24.9) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Dentro do Normal");
} else if (imc >= 24.9 && imc <= 29.9) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Sobrepeso");
} else if (imc >= 29.9 && imc <= 34.9) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade");
} else if (imc >= 34.9 && imc <= 39.9) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade Severa");
} else if (imc >= 39.9 && imc <= 49.9) {
JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade Mórbida");
} else if (imc >= 34.9 && imc <= 39.9) {
}
}
}