/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Clase que permite Dibujar una Casilla tipo Triángular.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class CasillaTriangulo extends Dibujado {

    protected int x[], y[];
    Polygon p;

   /**
     * Constructor que inicializa sus atributos y los de su clase padre.
     *
     * @param x dibujo del lado x
     * @param y dibujo del lado y.
     * @param p poligono triángulo.
     * @param coordenada coordenada corresponiente.
     * @param g implementación de gráficos.
     */
    public CasillaTriangulo(int x[], int y[], Polygon p, int coordenada, Graphics g) {
        super(coordenada, g);
        this.x = x;
        this.y = y;
        this.p= p;
    }

    /**
     * Método que permite dibujar una casilla tipo triángulo en el tablero.
     */
    @Override
    public void dibujar() {
        g.setColor(Color.ORANGE);
        g.drawPolygon(x, y, 4);
    }
}
