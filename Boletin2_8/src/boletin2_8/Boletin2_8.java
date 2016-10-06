package boletin2_8;

import javax.swing.JOptionPane; //Libreria JOptionPane

/**
 * Ejercicio 8
 * @author Adri
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float t = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en Celsius:  ")); //Inicializamos la temperatura y la pedimos.
        float far, kelvin; // Declaramos las variables far y kelvin
        far = 9 / 5 * t + 32; // Utilizamos la formula de conversion para Farenheit
        kelvin = t + 273; // Utilizamos la formula de conversion para Kelvin
        JOptionPane.showMessageDialog(null, "La temperatura en Farenheit es: " + far + "ºF y la temperatura en Kelvin es: "  + kelvin + "K"); // Mostramos por pantalla el valor convertido
    }

}
