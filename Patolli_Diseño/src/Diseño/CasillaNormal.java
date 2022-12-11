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
public class CasillaNormal implements Dibujado {
    
    private int[] x, y;
    private int medida=4;
    private int xx, yy;

    public CasillaNormal() {
    }

    public CasillaNormal(int xx, int yy){
        this.xx= xx;
        this.yy= yy;
    }

     @Override
     public void paint(Graphics g) {
        g.fillPolygon(x, y, medida);
        g.drawPolygon(x, y, medida);
    }
 
     public void addElemento(Dibujado dibujado){}

    /**
     * Método que permite crear las coordenadas correspondientes de las casillas
     */
    public void crear() {
        int[] XXX = {(xx + 45), (xx + 90), (xx + 45), xx};
        int[] YYY = {(yy + 45), yy, (yy - 45), yy};
        this.x = XXX;
        this.y = YYY;
    }
}
