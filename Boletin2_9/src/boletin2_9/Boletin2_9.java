package boletin2_9;

import javax.swing.JOptionPane;

/**
 * Boletin 2 Ejercicio 9
 * @author Adri
 */
public class Boletin2_9 {

    /** 
     * @param args 
     */
    public static void main(String[] args) {
       
        float n100, n20, n5, n1, total; //Declaracion de variables
          n100 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 100 ")); //Pedimos los billetes de 100
          n20 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 20 ")); //Pedimos los billetes de 20
          n5 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 5 ")); //Pedimos los billetes de 5
          n1 = Float.parseFloat(JOptionPane.showInputDialog("Monedas de 1 ")); //Pedimos las monedas de 1
          total = n100 * 100 + n20 * 20 + n5 * 5 + n1 ; //Calculamos el total
          JOptionPane.showMessageDialog(null, "El total es = " + total); //Mostramos el total
    }
    
}
