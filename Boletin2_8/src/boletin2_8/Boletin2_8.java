/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float t = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en Celsius:  "));
        float far, kelvin;
        far = 9 / 5 * t + 32;
        kelvin = t + 273;
        JOptionPane.showMessageDialog(null, "La temperatura en Farenheit es: " + far + "ºF");
        JOptionPane.showMessageDialog(null, "La temperatura en Kelvin es: " + kelvin + "K");

    }

}
