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
    //arriba
    /*
    xooooo
    oxoooo
    ooxooo
    oooxoo
    ooooxo
    ooooox
    */
    
    public void crearArriba(){
    //A1C2X={90,135,90,45};
    //A1C2Y={90,135,180,135};
    int[] XXX={xx,(xx+67),(xx+45)};
    int[] YYY={yy,(yy-22),(yy+45)};   
    this.x=XXX;
    this.y=YYY;
    }
    //abajo
    /*
    ooooox
    ooooxo
    oooxoo
    ooxooo
    oxoooo
    xooooo
    */
    public void crearAbajo(){
        int[] XXX={xx,(xx+67),(xx+45)};
        int[] YYY={yy,(yy+22),(yy-45)};   
        this.x=XXX;
        this.y=YYY;
    }
    
    @Override
    public void dibujar(Graphics g) {
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
