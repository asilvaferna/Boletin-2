
package boletin2_10;

import javax.swing.JOptionPane;

/**
 * Boletin 2 Ejercicio 10
 * @author Adri
 */
public class Boletin2_10 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        double bille100, resto, bille20, bille5, total; //Declaracion de variables
        total = Double.parseDouble(JOptionPane.showInputDialog("Inserta el total:  "));  //Pedimos el total
        bille100 = total/100; 
        resto = total - bille100*100;
        bille20 = resto/20;
        resto = resto - bille20*20;
        bille5 = resto/5;
        resto =resto - bille5*5;
        JOptionPane.showMessageDialog(null, "La cantidad de billetes de cien es: " + bille100 + "la cantidad de billetes de veinte es: " + bille20 + "la cantidad de billetes de cinco es: " + bille5 + "la cantidad de monedas de uno es: " + resto ); // Mostramos por pantalla cada cantidad

    }

}
