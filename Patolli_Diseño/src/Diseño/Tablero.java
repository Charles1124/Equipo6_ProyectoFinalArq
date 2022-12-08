/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;

/**
 *
 * @author deivi
 */
public class Tablero implements IDibujado{
protected int x[],y[];

    public Tablero(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.fillPolygon(x,y, 12);
        g.drawPolygon( x,  y,12);
    }
    
}
