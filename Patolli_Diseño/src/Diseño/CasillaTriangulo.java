/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;

/**
 * Clase que permite Dibujar una Casilla tipo Triángular.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class CasillaTriangulo implements IDibujado {

    protected int x[], y[];
    protected int xx, yy;
    protected int centrox = xx + 45, centroy = yy;

    /**
     * Constructor que inicializa los atributos.
     *
     * @param x coordenadas x abajo.
     * @param y coordenada y abajo.
     */
    public CasillaTriangulo(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor que inicializa los atributos.
     *
     * @param xx coordenadas x arriba.
     * @param yy coordenada y arriba.
     */
    public CasillaTriangulo(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }
    
    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     * triángulares del lado inferior del tablero.
     */
    public void crearIAB() {
        int[] XXX = {xx, (xx + 67), (xx + 45)};
        int[] YYY = {yy, (yy - 22), (yy + 45)};
        this.x = XXX;
        this.y = YYY;
    }

    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     * triángulares del lado superior deñ tablero.
     */
    public void crearDAB() {
        int[] XXX = {xx, (xx + 67), (xx + 45)};
        int[] YYY = {yy, (yy + 22), (yy - 45)};
        this.x = XXX;
        this.y = YYY;
    }

    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     * triángulares.
     */
    public void crear() {
        int[] XXX = {xx, (xx + 67), (xx + 45)};
        int[] YYY = {yy, (yy + 22), (yy - 45)};
        this.x = XXX;
        this.y = YYY;
    }

    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     * triángulares del lado inferior.
     */
    public void crearAbajo() {
        int[] XXX = {xx, (xx + 67), (xx + 45)};
        int[] YYY = {yy, (yy + 22), (yy - 45)};
        this.x = XXX;
        this.y = YYY;
    }

    /**
     * Método paint que hereda de la clase Graphics.
     *
     * @param g Recibe un gráfico a dibujar.
     */
    @Override
    public void paint(Graphics g) {
        g.fillPolygon(x,y, 3);
        g.drawPolygon( x,  y,3);
    }

    /**
     * Método que obtiene x valores del centro.
     */
    public int getCentrox() {
        return centrox;
    }
  
    /**
     * Método que obtiene y valores del centro.
     */
    public int getCentroy() {
        return centroy;
    }
    
}
