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
public class CasillaTriangulo implements IDibujado{
protected int x[],y[];
protected int xx,yy;
protected int centrox=xx+45,centroy=yy;
    
    public CasillaTriangulo(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    public CasillaTriangulo(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }
    
    public void crearIAB(){
    int[] XXX={xx,(xx+67),(xx+45)};
    int[] YYY={yy,(yy-22),(yy+45)};   
    this.x=XXX;
    this.y=YYY;
    }
    
    public void crearDAB(){
    int[] XXX={xx,(xx+67),(xx+45)};
    int[] YYY={yy,(yy+22),(yy-45)};   
    this.x=XXX;
    this.y=YYY;
    }
    
    public void crear(){
    int[] XXX={xx,(xx+67),(xx+45)};
    int[] YYY={yy,(yy+22),(yy-45)};   
    this.x=XXX;
    this.y=YYY;
    }
    public void crearAbajo(){
        int[] XXX={xx,(xx+67),(xx+45)};
        int[] YYY={yy,(yy+22),(yy-45)};   
        this.x=XXX;
        this.y=YYY;
    }
    
    @Override
    public void paint(Graphics g) {
        g.fillPolygon(x,y, 3);
        g.drawPolygon( x,  y,3);
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }
    
}
