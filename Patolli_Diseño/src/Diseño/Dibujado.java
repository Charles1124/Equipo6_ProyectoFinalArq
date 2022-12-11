/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;
import javax.swing.JPanel;


/**
 * Clase abstracta de Dibujado que ayuda a implemetar el patrón composite con
 el fin de cumplir el rol como clase padre. 
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public interface Dibujado{

    public void paint(Graphics g);
    public void addElemento(Dibujado dibujado);
}
