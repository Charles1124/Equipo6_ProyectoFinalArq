/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author cyt88
 */
public class EditorGráfico extends JPanel
{
   Graphics g;

    public void rellenado(){
    Dibujado d1= new CasillaNormal(90, 90);
    Dibujado c = new CompositorTablero(1);
    c.paint(g);
    c.addElemento(d1); 
   }
}
