/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            float i, n, t ;
            double renta ;
            n= Float.parseFloat(JOptionPane.showInputDialog("Introduce el nominal:  "));
            i = Float.parseFloat(JOptionPane.showInputDialog("Introduce el interes anual en tanto por uno:  "));
            t = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero de años en meses:  "));
            renta = n * Math.pow(1 + i, t) * i / (Math.pow(1 + i,t) - 1);
            JOptionPane.showMessageDialog(null, "La renta mensual es " + renta);

    }
    
}
