/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precio, tarifa, descuento;
        precio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio pagado:  "));
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("Introduce la tarifa real:  "));
        descuento = (tarifa - precio) / tarifa * 100;
        JOptionPane.showMessageDialog(null, "El descuento es de un " + descuento + "%");
    }
    
}
