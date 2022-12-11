/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;


/**
 * Clase abstracta de Dibujado que ayuda a implemetar el patrón composite con
 el fin de cumplir el rol como clase padre. 
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public abstract class Dibujado{

    protected int coordenada;
    protected Graphics g;

    public Dibujado(int coordenada) {
        this.coordenada = coordenada;
    }

    /**
     * Constructor que inicializa los atributos.
     *
     * @param coordenada coordeanda correspondiente de una figura.
     * @param g gráficos para el dibujo
     */
    public Dibujado(int coordenada, Graphics g) {
        this.coordenada = coordenada;
        this.g = g;
    }

    /**
     * Método abstracto que permite el dibujado.
     */
    public abstract void dibujar();
}
