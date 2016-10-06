/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2, sum, res, prod, coc;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero 1:  "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero 2:  "));
        sum = num1 + num2;
        res = num1 - num2;
        prod = num1 * num2;
        coc = num1 / num2;
        JOptionPane.showMessageDialog(null, "El resultado es =  " + sum);
        JOptionPane.showMessageDialog(null, "El resultado es =  " + res);
        JOptionPane.showMessageDialog(null, "El resultado es =  " + prod);
        JOptionPane.showMessageDialog(null, "El resultado es =  " + coc);
    }
    
}
