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
public class CasillaEspecial implements IDibujado{
    protected int x[],y[];
    protected int xx,yy;
    protected int centrox=xx+45,centroy=yy;
    
    @Override
    public void dibujar(Graphics g) {
        g.fillPolygon(x,y, 4);
        g.drawPolygon( x,  y,4);
    }

    public CasillaEspecial(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }
    
    public void crear(){
    int[] A1C1X={(xx+45),(xx+90),(xx+45),xx};
    int[] A1C1Y={(yy+45),yy,(yy-45),yy};   
    this.x=A1C1X;
    this.y=A1C1Y;
    }

    public int getCentroy() {
        return centroy;
    }

    public void setCentroy(int centroy) {
        this.centroy = centroy;
    }
    
    
}
