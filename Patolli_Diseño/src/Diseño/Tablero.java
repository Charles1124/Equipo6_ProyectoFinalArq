/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Tablero extends JPanel implements IDibujado{
    @Override
    public void paint(Graphics g){
    
//    int[] Tablerox={135,450,765,855,540,855,765,450,135,45,360,45};
//    int[] Tableroy={45,360,45,135,450,765,855,540,855,765,450,135};
//    g.drawPolygon(Tablerox, Tableroy, 12);
    
    
    //    Aspa A (Arriba izquierda)
    
    int A1C1X=90;
    int A1C1Y=90;
    CasillaNormal A1C1 = new CasillaNormal(A1C1X,A1C1Y);
    A1C1.crear();
    g.setColor(Color.darkGray);
    A1C1.paint(g);

    //Casilla 2

    int A1C2X=45;
    int A1C2Y=135;
    CasillaNormal A1C2 = new CasillaNormal(A1C2X,A1C2Y);
    A1C2.crear();
    g.setColor(Color.GRAY);
    A1C2.paint(g);
    
    //Casilla 3
    int A1C3X = 135;
    int A1C3Y = 135;
    CasillaNormal A1C3 = new CasillaNormal(A1C3X,A1C3Y);
    A1C3.crear();
    g.setColor(Color.GRAY);
    A1C3.paint(g);

    //Casilla 4
    int A1C4X = 90;
    int A1C4Y = 180;
    CasillaNormal A1C4 = new CasillaNormal(A1C4X,A1C4Y);
    A1C4.crear();
    g.setColor(Color.darkGray);
    A1C4.paint(g);
    
    int A1C4x=90;
    int A1C4y=180;
    CasillaTriangulo A1C2c = new CasillaTriangulo(A1C4x,A1C4y);
    A1C2c.crearIAB();
    g.setColor(Color.YELLOW);
    A1C2c.paint(g);
    
    //Casilla 5
    int A1C5X=180;
    int A1C5Y=180;
    CasillaNormal A1C5 = new CasillaNormal(A1C5X,A1C5Y);
    A1C5.crear();
    g.setColor(Color.darkGray);
    A1C5.paint(g);
    //Casilla 6
    int A1C6X=135;
    int A1C6Y=225;
    CasillaNormal A1C6 = new CasillaNormal(A1C6X,A1C6Y);
    A1C6.crear();
    g.setColor(Color.GRAY);
    A1C6.paint(g);
    
    int A1C4xC=135;
    int A1C4yC=225;
    CasillaTriangulo A1C2cc = new CasillaTriangulo(A1C4xC,A1C4yC);
    A1C2cc.crearIAB();
    g.setColor(Color.YELLOW);
    A1C2cc.paint(g);
    
    //Casilla 7

    int A1C7X=225;
    int A1C7Y=225;
    CasillaNormal A1C7 = new CasillaNormal(A1C7X,A1C7Y);
    A1C7.crear();
    g.setColor(Color.GRAY);
    A1C7.paint(g);
    //Casilla 8
    
    int A1C8X=180;
    int A1C8Y=270;
    CasillaNormal A1C8 = new CasillaNormal(A1C8X,A1C8Y);
    A1C8.crear();
    g.setColor(Color.darkGray);
    A1C8.paint(g);
    //Casilla 9
    int A1C9X=270;
    int A1C9Y=270;
    CasillaNormal A1C9 = new CasillaNormal(A1C9X,A1C9Y);
    A1C9.crear();
    g.setColor(Color.darkGray);
    A1C9.paint(g);
    //Casilla 10
    int A1C10X=225;
    int A1C10Y=315;
    CasillaNormal A1C10 = new CasillaNormal(A1C10X,A1C10Y);
    A1C10.crear();
    g.setColor(Color.GRAY);
    A1C10.paint(g);
    //Casilla 11
    int A1C11X=315;
    int A1C11Y=315;
    CasillaNormal A1C11 = new CasillaNormal(A1C11X,A1C11Y);
    A1C11.crear();
    g.setColor(Color.YELLOW);
    A1C11.paint(g);
    //Casilla 12
    int A1C12X=270;
    int A1C12Y=360;
    CasillaNormal A1C12 = new CasillaNormal(A1C12X,A1C12Y);
    A1C12.crear();
    g.setColor(Color.darkGray);
    A1C12.paint(g);
    //Casilla 13

    int A1C13X=360;
    int A1C13Y=360;
    CasillaNormal A1C13 = new CasillaNormal(A1C13X,A1C13Y);
    A1C13.crear();
    g.setColor(Color.darkGray);
    A1C13.paint(g);
    //Casilla 14
    int A1C14X=315;
    int A1C14Y=405;
    CasillaNormal A1C14 = new CasillaNormal(A1C14X,A1C14Y);
    A1C14.crear();
    g.setColor(Color.GRAY);
    A1C14.paint(g);

    //                  Aspa B (Arrina derecha)
    //Casilla 1
    int A2C1X=720;
    int A2C1Y=90;
    CasillaNormal A2C1 = new CasillaNormal(A2C1X,A2C1Y);
    A2C1.crear();
    g.setColor(Color.darkGray);
    A2C1.paint(g);
    //Casilla 2
    int A2C2X=765;
    int A2C2Y=135;
    CasillaNormal A2C2 = new CasillaNormal(A2C2X,A2C2Y);
    A2C2.crear();
    g.setColor(Color.GRAY);
    A2C2.paint(g);
    //Casilla 3
    int A2C3X=720;
    int A2C3Y=180;
    CasillaNormal A2C3 = new CasillaNormal(A2C3X,A2C3Y);
    A2C3.crear();
    g.setColor(Color.darkGray);
    A2C3.paint(g);
    
//    CasillaTriangulo A2C3XC = new CasillaTriangulo(A2C3X,A2C3Y);
//    A2C3XC.crearIAB();
//    g.setColor(Color.YELLOW);
//    A2C3XC.paint(g);
    
    
    
    
    
    
    //Casilla 4
    int A2C4X=675;
    int A2C4Y=135;
    CasillaNormal A2C4= new CasillaNormal(A2C4X,A2C4Y);
    A2C4.crear();
    g.setColor(Color.GRAY);
    A2C4.paint(g);
    
    CasillaTriangulo A2C4XC = new CasillaTriangulo(A2C4X,A2C4Y);
    A2C4XC.crearDAB();
    g.setColor(Color.YELLOW);
    A2C4XC.paint(g);
    //Casilla 5
    int A2C5X=675;
    int A2C5Y=225;
    CasillaNormal A2C5= new CasillaNormal(A2C5X,A2C5Y);
    A2C5.crear();
    g.setColor(Color.GRAY);
    A2C5.paint(g);
    //Casilla 6
    int A2C6X=630;
    int A2C6Y=180;
    CasillaNormal A2C6= new CasillaNormal(A2C6X,A2C6Y);
    A2C6.crear();
    g.setColor(Color.darkGray);
    A2C6.paint(g);
    
    CasillaTriangulo A2C6XC = new CasillaTriangulo(A2C6X,A2C6Y);
    A2C6XC.crearDAB();
    g.setColor(Color.YELLOW);
    A2C6XC.paint(g);
    
    
    //Casilla 7
    int A2C7X=630;
    int A2C7Y=270;
    CasillaNormal A2C7= new CasillaNormal(A2C7X,A2C7Y);
    A2C7.crear();
    g.setColor(Color.darkGray);
    A2C7.paint(g);
    //Casilla 8
    int A2C8X=585;
    int A2C8Y=225;
    CasillaNormal A2C8= new CasillaNormal(A2C8X,A2C8Y);
    A2C8.crear();
    g.setColor(Color.GRAY);
    A2C8.paint(g);
    //Casilla 9
    int A2C9X=585;
    int A2C9Y=315;
    CasillaNormal A2C9= new CasillaNormal(A2C9X,A2C9Y);
    A2C9.crear();
    g.setColor(Color.GRAY);
    A2C9.paint(g);
    //Casilla 10
    int A2C10X=540;
    int A2C10Y=270;
    CasillaNormal A2C10= new CasillaNormal(A2C10X,A2C10Y);
    A2C10.crear();
    g.setColor(Color.darkGray);
    A2C10.paint(g);
    //Casilla 11 
    int A2C11X=540;
    int A2C11Y=360;
    CasillaNormal A2C11= new CasillaNormal(A2C11X,A2C11Y);
    A2C11.crear();
    g.setColor(Color.YELLOW);
    A2C11.paint(g);
    //Casilla 12
    int A2C12X=495;
    int A2C12Y=315;
    CasillaNormal A2C12= new CasillaNormal(A2C12X,A2C12Y);
    A2C12.crear();
    g.setColor(Color.GRAY);
    A2C12.paint(g);
    //Casilla 13
    int A2C13X=495;
    int A2C13Y=405;
    CasillaNormal A2C13= new CasillaNormal(A2C13X,A2C13Y);
    A2C13.crear();
    g.setColor(Color.GRAY);
    A2C13.paint(g);
    //Casilla 14
    int A2C14X=450;
    int A2C14Y=360;
    CasillaNormal A2C14= new CasillaNormal(A2C14X,A2C14Y);
    A2C14.crear();
    g.setColor(Color.darkGray);
    A2C14.paint(g);

    //Casilla 1 del centro
    int Centro1X=405;
    int Centro1Y=405;
    CasillaNormal Centro1= new CasillaNormal(Centro1X,Centro1Y);
    Centro1.crear();
    g.setColor(Color.GRAY);
    Centro1.paint(g);
    //Casilla 2 del centro

    int Centro2X=360;
    int Centro2Y=450;
    CasillaNormal Centro2= new CasillaNormal(Centro2X,Centro2Y);
    Centro2.crear();
    g.setColor(Color.darkGray);
    Centro2.paint(g);
    //Casilla 3 del centro
    int Centro3X=450;
    int Centro3Y=450;
    CasillaNormal Centro3= new CasillaNormal(Centro3X,Centro3Y);
    Centro3.crear();
    g.setColor(Color.darkGray);
    Centro3.paint(g);
    //Casilla 4 del centro
    int[]Centro4X={450,495,450,405};
    int[]Centro4Y={450,495,540,495};
    g.drawPolygon(Centro4X,Centro4Y,4);
    g.setColor(Color.GRAY);
    g.fillPolygon(Centro4X, Centro4Y, 4);



    
    
    


    //                  Aspa C (abajo IZQUIERDA)
    //Casilla 1
    int A3C1X=45;
    int A3C1y=765;
    CasillaNormal A3C1= new CasillaNormal(A3C1X,A3C1y);
    A3C1.crear();
    g.setColor(Color.gray);
    A3C1.paint(g);
    //Casilla 2
    int A3C2X=90;
    int A3C2y=810;
    CasillaNormal A3C2= new CasillaNormal(A3C2X,A3C2y);
    A3C2.crear();
    g.setColor(Color.darkGray);
    A3C2.paint(g);
    //Casilla 3
    int A3C3X=135;
    int A3C3y=765;
    CasillaNormal A3C3= new CasillaNormal(A3C3X,A3C3y);
    A3C3.crear();
    g.setColor(Color.gray);
    A3C3.paint(g);
    //Casilla 4
    int A3C4X=90;
    int A3C4y=720;
    CasillaNormal A3C4= new CasillaNormal(A3C4X,A3C4y);
    A3C4.crear();
    g.setColor(Color.darkGray);
    A3C4.paint(g);
    CasillaTriangulo A3C4c = new CasillaTriangulo(A3C4X,A3C4y);
    A3C4c.crearDAB();
    g.setColor(Color.YELLOW);
    A3C4c.paint(g);
    //Casilla 5
    int A3C5X=180;
    int A3C5y=720;
    CasillaNormal A3C5= new CasillaNormal(A3C5X,A3C5y);
    A3C5.crear();
    g.setColor(Color.darkGray);
    A3C5.paint(g);
    //Casilla 6
    int A3C6X=135;
    int A3C6y=675;
    CasillaNormal A3C6= new CasillaNormal(A3C6X,A3C6y);
    A3C6.crear();
    g.setColor(Color.GRAY);
    A3C6.paint(g);
    CasillaTriangulo A3C6c = new CasillaTriangulo(A3C6X,A3C6y);
    A3C6c.crearDAB();
    g.setColor(Color.YELLOW);
    A3C6c.paint(g);
    //Casilla 7
    int A3C7X=225;
    int A3C7y=675;
    CasillaNormal A3C7= new CasillaNormal(A3C7X,A3C7y);
    A3C7.crear();
    g.setColor(Color.GRAY);
    A3C7.paint(g);
    //Casilla 8
    int A3C8X=180;
    int A3C8y=630;
    CasillaNormal A3C8= new CasillaNormal(A3C8X,A3C8y);
    A3C8.crear();
    g.setColor(Color.darkGray);
    A3C8.paint(g);
    //Casilla 9

    int A3C9X=270;
    int A3C9y=630;
    CasillaNormal A3C9= new CasillaNormal(A3C9X,A3C9y);
    A3C9.crear();
    g.setColor(Color.darkGray);
    A3C9.paint(g);
    //Casilla 10
    int A3C10X=225;
    int A3C10y=585;
    CasillaNormal A3C10= new CasillaNormal(A3C10X,A3C10y);
    A3C10.crear();
    g.setColor(Color.GRAY);
    A3C10.paint(g);
    //Casilla 11
    int A3C11X=315;
    int A3C11y=585;
    CasillaNormal A3C11= new CasillaNormal(A3C11X,A3C11y);
    A3C11.crear();
    g.setColor(Color.GRAY);
    A3C11.paint(g);
    //Casilla 12
    int A3C12X=270;
    int A3C12y=540;
    CasillaNormal A3C12= new CasillaNormal(A3C12X,A3C12y);
    A3C12.crear();
    g.setColor(Color.YELLOW);
    A3C12.paint(g);
    //Casilla 13
    //Casilla 13
    int A3C13x=360;
    int A3C13Y=540;
    CasillaNormal A3C13= new CasillaNormal(A3C13x,A3C13Y);
    A3C13.crear();
    g.setColor(Color.darkGray);
    A3C13.paint(g);
    //Casilla 14
    int A3C14X=315;
    int A3C14y=495;
    CasillaNormal A3C14= new CasillaNormal(A3C14X,A3C14y);
    A3C14.crear();
    g.setColor(Color.GRAY);
    A3C14.paint(g);







    //                  Aspa D (abajo DERECHA)
    //Casilla 1
    int A4C1X=765;
    int A4C1y=765;
    CasillaNormal A4C1= new CasillaNormal(A4C1X,A4C1y);
    A4C1.crear();
    g.setColor(Color.GRAY);
    A4C1.paint(g);
    //Casilla 2
    int A4C2X=720;
    int A4C2y=810;
    CasillaNormal A4C2= new CasillaNormal(A4C2X,A4C2y);
    A4C2.crear();
    g.setColor(Color.darkGray);
    A4C2.paint(g);
    //Casilla 3
    int A4C3X=675;
    int A4C3Y=765;
    CasillaNormal A4C3= new CasillaNormal(A4C3X,A4C3Y);
    A4C3.crear();
    g.setColor(Color.GRAY);
    A4C3.paint(g);
    
    CasillaTriangulo A4C3XXX = new CasillaTriangulo(A4C3X,A4C3Y);
    A4C3XXX.crearIAB();
    g.setColor(Color.YELLOW);
    A4C3XXX.paint(g);
    
    //Casilla 4
    int A4C4X=720;
    int A4C4Y=720;
    CasillaNormal A4C4= new CasillaNormal(A4C4X,A4C4Y);
    A4C4.crear();
    g.setColor(Color.darkGray);
    A4C4.paint(g);

    //Casilla 5

    int A4C5X=630;
    int A4C5Y=720;
    CasillaNormal A4C5= new CasillaNormal(A4C5X,A4C5Y);
    A4C5.crear();
    g.setColor(Color.darkGray);
    A4C5.paint(g);
    
    CasillaTriangulo A4C5XC = new CasillaTriangulo(A4C5X,A4C5Y);
    A4C5XC.crearIAB();
    g.setColor(Color.YELLOW);
    A4C5XC.paint(g);
    
    
    //Casilla 6
    int A4C6X=675;
    int A4C6Y=675;
    CasillaNormal A4C6= new CasillaNormal(A4C6X,A4C6Y);
    A4C6.crear();
    g.setColor(Color.GRAY);
    A4C6.paint(g);
    
    //Casilla 7
    int A4C7X=585;
    int A4C7Y=675;
    CasillaNormal A4C7= new CasillaNormal(A4C7X,A4C7Y);
    A4C7.crear();
    g.setColor(Color.GRAY);
    A4C7.paint(g);
    //Casilla 8
    int A4C8X=630;
    int A4C8Y=630;
    CasillaNormal A4C8= new CasillaNormal(A4C8X,A4C8Y);
    A4C8.crear();
    g.setColor(Color.darkGray);
    A4C8.paint(g);
    //Casilla 9
    int A4C9X=540;
    int A4C9Y=630;
    CasillaNormal A4C9= new CasillaNormal(A4C9X,A4C9Y);
    A4C9.crear();
    g.setColor(Color.darkGray);
    A4C9.paint(g);
    //Casilla 10
    int A4C10X=585;
    int A4C10Y=585;
    CasillaNormal A4C10= new CasillaNormal(A4C10X,A4C10Y);
    A4C10.crear();
    g.setColor(Color.GRAY);
    A4C10.paint(g);
    //Casilla 11
    int A4C11X=495;
    int A4C11Y=585;
    CasillaNormal A4C11= new CasillaNormal(A4C11X,A4C11Y);
    A4C11.crear();
    g.setColor(Color.YELLOW);
    A4C11.paint(g);
    //Casilla 12
    int A4C12X=540;
    int A4C12Y=540;
    CasillaNormal A4C12= new CasillaNormal(A4C12X,A4C12Y);
    A4C12.crear();
    g.setColor(Color.darkGray);
    A4C12.paint(g);
    //Casilla 13
    int A4C13X=450;
    int A4C13Y=540;
    CasillaNormal A4C13= new CasillaNormal(A4C13X,A4C13Y);
    A4C13.crear();
    g.setColor(Color.darkGray);
    A4C13.paint(g);
    //Casilla 14
    int A4C14X=495;
    int A4C14Y=495;
    CasillaNormal A4C14= new CasillaNormal(A4C14X,A4C14Y);
    A4C14.crear();
    g.setColor(Color.GRAY);
    A4C14.paint(g);
            //Esquinas
           //     arriba izquierda

    //int animox=26,animoy=26,ancho=130,largo=130,anguloInicial=5,anguloArco=130;
    //CasillaSemiCirculo semi = new CasillaSemiCirculo (animox,animoy,ancho,largo,anguloInicial,anguloArco);
    //semi.dibujar(g);
    }
    
}
