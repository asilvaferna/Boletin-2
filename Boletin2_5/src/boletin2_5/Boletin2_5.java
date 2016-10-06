/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia en millas:  "));
        double metros;
        final double EQUI = 1852;
        metros = distancia * EQUI;
        JOptionPane.showMessageDialog(null, "El resultado es =  " + metros + " m");
        
    }
    
}
