/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Clase que permite Dibujar una Casilla Normal en el tablero.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class CasillaNormal extends Dibujado {
   
    private int[] x, y;

    /**
     * Constructor que inicializa sus atributos y los de su clase padre.
     *
     * @param x dibujo del lado x
     * @param y dibujo del lado y.
     * @param coordenada coordenada corresponiente.
     * @param g implementación de gráficos.
     */
    public CasillaNormal(int x[], int y[], int coordenada, Graphics g) {
        super(coordenada, g);
        this.x = x;
        this.y = y;
    }

    /**
     * Método que permite dibujar una casilla normal en el tablero.
     */
    @Override
    public void dibujar() {
        g.setColor(Color.black);
        g.drawPolygon(x, y, 4);
    }
}
