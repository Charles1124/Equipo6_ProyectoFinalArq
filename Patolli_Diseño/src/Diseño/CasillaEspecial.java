/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 * Clase que permite Dibujar una Casilla Especial o Casilla Centro.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class CasillaEspecial extends JPanel implements Dibujado {

    private static CompositorTablero instancia;

    public static CompositorTablero getInstancia(){
        if(instancia==null){
               instancia= new CompositorTablero();
         }
         return instancia;
    }

    /**
     * Constructor Vacío.
     */
    public CasillaEspecial() {
    }

  
    /**
     * Método que implementa la interfaz IDibujado y se encarga de pintar
     * las casillas de tipo especial o centro.
     * @param g Recibe un gráfico a dibujar.
     */
    @Override
    public void paint(Graphics g) {
        int A1C1X = 315;
        int A1C1Y = 315;
        instancia= new CompositorTablero(A1C1Y, A1C1X);
        instancia.crear();
        g.setColor(Color.YELLOW);
        instancia.paint(g);
 

        //Casilla 2
        int A1C2X = 540;
        int A1C2Y = 360;
        instancia= new CompositorTablero(A1C2Y, A1C2X);
        instancia.crear();
        g.setColor(Color.YELLOW);
        instancia.paint(g);

        //Casilla 3
        int A1C3X = 270;
        int A1C3Y = 540;
        instancia= new CompositorTablero(A1C3Y, A1C3X);
        instancia.crear();
        g.setColor(Color.YELLOW);
        instancia.paint(g);

        //Casilla 4
        int A1C4X = 495;
        int A1C4Y = 585;
        instancia= new CompositorTablero(A1C4Y, A1C4X);
        instancia.crear();
        g.setColor(Color.YELLOW);
        instancia.paint(g);
    }

}
