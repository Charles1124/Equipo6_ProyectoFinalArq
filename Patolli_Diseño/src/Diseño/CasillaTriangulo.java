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
public class CasillaTriangulo implements Dibujado {

    protected int x[], y[];
    protected int xx, yy;

    /**
     * Constructor Vacío.
     */
    public CasillaTriangulo() {
    }

    /**
     * Constructor que inicializa los atributos de la clase.
     *
     */
    public CasillaTriangulo(int[] x, int[] y) { 
         this.x= x; 
         this.y= y;
      }
  
    /**
     * Método que implementa la interfaz IDibujado y se encarga de pintar
     * las casillas de tipo especial o centro.
     * @param g Recibe un gráfico a dibujar.
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE); 
        Polygon poligono= new Polygon(x, y, x.length);
        g.drawPolygon(poligono); 
    }   
}
