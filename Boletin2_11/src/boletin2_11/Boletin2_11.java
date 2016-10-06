package boletin2_11;

import javax.swing.JOptionPane;

/**
 * Boletin 2 Ejercicio 11 y 12 
 * @author Adri
 */
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sueldoTai, sueldoTdi, sueldoF, ventasTot, distancia, diasDesp, impuesto; //Declaracion de variables
        sueldoF = Double.parseDouble(JOptionPane.showInputDialog("Sueldo Fijo ")); //Pedimos el sueldo fijo
        ventasTot = Double.parseDouble(JOptionPane.showInputDialog("Ventas totales ")); //Pedimos las ventas totales
        distancia = Double.parseDouble(JOptionPane.showInputDialog("Distancia en Km ")); //Pedimos la distancia recorrida
        diasDesp = Double.parseDouble(JOptionPane.showInputDialog("Dias desplazado ")); //Pedimos los dias desplazados
        sueldoTai = sueldoF + ventasTot * 0.05 + distancia * 2 + diasDesp * 30; //Calculamos el sueldo total antes de impuestos
        impuesto = sueldoTai * 0.18 + 36; //Calculamos los impuestos
        sueldoTdi = sueldoTai - impuesto; //Calculamos el sueldo total despues de impuestos
        JOptionPane.showMessageDialog(null, "El sueldo despues de impuestos es = " + sueldoTdi); //Mostramos el sueldo total despues de impuestos
       /*
        * Se han realizado los ejercicios 11 y 12 en el mismo código al ser complementarios
        */
        
    }
    
}
