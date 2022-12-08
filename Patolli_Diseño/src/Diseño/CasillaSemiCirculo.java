/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;

/**
 * Clase que permite Dibujar una Casilla SemiCircular o la esquina del tablero.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class CasillaSemiCirculo implements IDibujado {

    protected int x, y, ancho, largo, anguloInicial, anguloArco;
    protected int centrox, centroy;

    /**
     * Constructor que inicializa los atributos de la clase.
     *
     * @param x Coodenada x.
     * @param y Coordenada y.
     * @param ancho ancho Círculo.
     * @param largo largo Círculo.
     * @param anguloInicial Ángulo Inicial Círculo.
     * @param anguloArco Ángulo Arco Círculo.
     */
    public CasillaSemiCirculo(int x, int y, int ancho, int largo, int anguloInicial, int anguloArco) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.largo = largo;
        this.anguloInicial = anguloInicial;
        this.anguloArco = anguloArco;
    }

    /**
     * Método paint que hereda de la clase Graphics.
     *
     * @param g Recibe un gráfico a dibujar.
     */
    @Override
    public void paint(Graphics g) {
        g.drawArc(x, y, ancho, largo, anguloInicial, anguloArco);
        g.fillArc(x, y, ancho, largo, anguloInicial, anguloArco);
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
