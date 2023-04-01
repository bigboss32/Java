/*
 * Fichero: MainEjemplo.java
 * Autor: Chuidiang
 * Fecha: 8/06/07 18:05
 */
 

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 * Pequeño main de ejemplo que abre una ventana con un LienzoParaArrastrarFiguras
 * con tres rectangulos y tres circunferencias.
 *
 * @author Chuidiang
 *
  */
public class MainEjemplo
{
    /**
     * Crea la ventana con el Canvas y lo visualiza
     *
     * @param args Se ignoran
     */
    public static void main(String[] args)
    {
        JFrame v = new JFrame("Arrastrar Grafico");
        LienzoParaArrastrarFiguras c = new LienzoParaArrastrarFiguras();
        c.addFigura(new Rectangulo(50, 50, 50, 50, Color.RED));
        c.addFigura(new Rectangulo(50,50, 50, 50, Color.GREEN));
        c.addFigura(new Rectangulo(50, 50, 50, 50, Color.CYAN));
       
       
        v.add(c);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
