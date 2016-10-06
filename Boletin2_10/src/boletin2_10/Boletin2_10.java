
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

        double n100, n20, n5, n1, total; //Declaracion de variables
        total = Double.parseDouble(JOptionPane.showInputDialog("Inserta el total:  "));  //Pedimos el total
        n100 = total % 100; //Damos el numero de billetes de 100
        n20 = n100 % 20; //Damos el numero de billetes de 20
        n5 = n20 % 5; //Damos el numero de billetes de 5
        n1 = n5 % 1; //Damos el numero de monedas de 1
        JOptionPane.showMessageDialog(null, "La cantidad de billetes de cien es: " + n100 + "la cantidad de billetes de veinte es: " + n20 + "la cantidad de billetes de cinco es: " + n5 + "la cantidad de monedas de uno es: " + n1 ); // Mostramos por pantalla cada cantidad

    }

}
