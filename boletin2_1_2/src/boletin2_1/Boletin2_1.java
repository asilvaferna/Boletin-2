package boletin2_1;

import javax.swing.JOptionPane;

public class Boletin2_1 {
/**
 * 
 * @author Adrián Silva 
     * @param args 
 */
    public static void main(String[] args) {
          //area rectangulo de base = 3, altura = 4

          float width ; 
          float height ; 
          float area ;
          width = Float.parseFloat(JOptionPane.showInputDialog("Width "));
          height = Float.parseFloat(JOptionPane.showInputDialog("Height "));
          area = width * height ;
          JOptionPane.showMessageDialog(null, "Area = " + area);
/*
 *
 *El programa muestra el area del rectangulo
 *Pide los valores de base y altura
 *
 */
          
        }

}
