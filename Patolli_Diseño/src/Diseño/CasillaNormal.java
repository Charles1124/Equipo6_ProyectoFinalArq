/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;

/**
 * Clase que permite Dibujar una Casilla Normal en el tablero.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class CasillaNormal implements IDibujado {

    protected int x[], y[];
    protected int xx, yy;
    protected int centrox = xx + 45, centroy = yy;

    /**
     * Método paint que hereda de la clase Graphics.
     *
     * @param g Recibe un gráfico a dibujar.
     */
    @Override
    public void paint(Graphics g) {
        g.fillPolygon(x, y, 4);
        g.drawPolygon(x, y, 4);
    }

    /**
     * Constructor que inicializa los atributos de la clase.
     *
     * @param xx Coordenadas de x.
     * @param yy Coordenadas de y.
     */
    public CasillaNormal(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }

    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     */
    public void crear() {
        int[] XXX = {(xx + 45), (xx + 90), (xx + 45), xx};
        int[] YYY = {(yy + 45), yy, (yy - 45), yy};
        this.x = XXX;
        this.y = YYY;
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
