/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;

/**
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class CasillaSemiCirculo implements IDibujado{
protected int x,y,ancho,largo,anguloInicial,anguloArco;
protected int centrox,centroy;

    public CasillaSemiCirculo(int x, int y, int ancho, int largo, int anguloInicial, int anguloArco) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.largo = largo;
        this.anguloInicial = anguloInicial;
        this.anguloArco = anguloArco;
    }

    
    
    @Override
    public void paint(Graphics g) {
        g.drawArc(x,y,ancho,largo,anguloInicial,anguloArco);
        g.fillArc(x,y,ancho,largo,anguloInicial,anguloArco);
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }
}
