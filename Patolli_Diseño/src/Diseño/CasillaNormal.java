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
public class CasillaNormal implements IDibujado{    
    protected int x[],y[];
    protected int xx,yy;
    protected int centrox=xx+45,centroy=yy;
    
    @Override
    public void paint(Graphics g) {
        g.fillPolygon(x,y, 4);
        g.drawPolygon( x,  y,4);
    }

    public CasillaNormal(int xx, int yy) {
        this.xx = xx;
        this.yy = yy;
    }
    
    public void crear(){
    int[] XXX={(xx+45),(xx+90),(xx+45),xx};
    int[] YYY={(yy+45),yy,(yy-45),yy};   
    this.x=XXX;
    this.y=YYY;
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }
    
}
