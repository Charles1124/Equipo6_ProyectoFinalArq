/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;

import Dominio.Casilla;
import Dominio.Ficha;
import Dominio.Tablero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;
import javax.swing.JPanel;

/**
 * Clase Edutor Gráfico que hereda de JPanel y permite realizar los dibujos
 * correspondientes en base a sus coordenadas.
 *
 * @author Carlos Valle
 */
public class EditorGráfico extends JPanel
{
    private List<List<Integer>> listaX;
    private List<List<Integer>> listaY;
    List<Polygon> triangulo;
    private List<Integer> coordx, coordy;
    private Tablero tablero;
//

    /**
     * Constructor que inicializa los atributos
     *
     * @param tablero Clase de tablero perteneciente al dominio.
     */
    public EditorGráfico(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Constructor Vacío.
     */
    public EditorGráfico() {
    }

    /**
     * Método que extiende de JPanel que ayuda a pintar el contenedor del
     * tablero.
     *
     * @param g Gráficos correspondientes.
     */
    public void pintarComponente(Graphics g) {
        super.paintComponent(g);
        this.dibujoPrincipal(g);
        this.contenedorFichas(tablero.getCasillas(), g);
    }

    /**
     * Método de dibujo princial en donde se van dibujando y agregando las
     * casillas a la lista las casillas dependiendo su tipo.
     *
     * @param g Gráficos correspondientes.
     */
     public void dibujoPrincipal(Graphics g) {
        CompositorTablero editorGrafico = new CompositorTablero(14);
        int triangulosCasilla = 0;
        for (int i = 0; i < 60; i++) {
            Casilla casilla = this.tablero.getCasillas().get(i);
            Dibujado dibujo = null;
            casilla.getTipoCasilla();
            if (casilla.getTipoCasilla().equals("NORMAL")) {
                dibujo = new CasillaNormal(new int[]{listaX.get(i).get(0), listaX.get(i).get(1),
                    listaX.get(i).get(2), listaX.get(i).get(3)}, new int[]{listaY.get(i).get(0), listaY.get(i).get(1),
                    listaY.get(i).get(2), listaY.get(i).get(3)}, (i + 1), g);
            }
            if (casilla.getTipoCasilla().equals("ESPECIAL")) {
                dibujo = new CasillaEspecial(new int[]{listaX.get(i).get(0), listaX.get(i).get(1),
                    listaX.get(i).get(2), listaX.get(i).get(3)}, new int[]{listaY.get(i).get(0), listaY.get(i).get(1),
                    listaY.get(i).get(2), listaY.get(i).get(3)}, (i + 1), g);
            }
            if (casilla.getTipoCasilla().equals("TRIANGULAR")) {
                dibujo = new CasillaTriangulo(new int[]{listaX.get(i).get(0), listaX.get(i).get(1),
                    listaX.get(i).get(2), listaX.get(i).get(3)}, new int[]{listaY.get(i).get(0), listaY.get(i).get(1),
                    listaY.get(i).get(2), listaY.get(i).get(3)}, triangulo.get(triangulosCasilla),(i + 1), g);
                    triangulosCasilla+=1;
            }
            editorGrafico.addElemento(dibujo); 
        }
        editorGrafico.dibujar();
    }

    /**
     * Método contenedorFichas que obtiene una lista de casillas para dibujar
     * las fichas en base a una posición.
     *
     * @param casilla Lista de casillas.
     * @param g Gráficos correspondientes.
     */
    public void contenedorFichas(List<Casilla> casilla, Graphics g) {

        for (int i = 0; i < casilla.size(); i++) {
            Ficha obtiene = casilla.get(i).getFicha();
            if (obtiene != null) {
                if (obtiene.getJugador().getColor().equals("MAGENTA")) {
                    g.setColor(Color.BLUE);
                    g.fillOval(coordx.get(i), coordy.get(i), 22, 22);
                }
                if (obtiene.getJugador().getColor().equals("AZUL")) {
                    g.setColor(Color.PINK);
                    g.fillOval(coordx.get(i), coordy.get(i), 22, 22);
                }
                if (obtiene.getJugador().getColor().equals("AMARILLO")) {
                    g.setColor(Color.GREEN);
                    g.fillOval(coordx.get(i), coordy.get(i), 22, 22);
                }
                if (obtiene.getJugador().getColor().equals("VERDE")) {
                    g.setColor(Color.RED);
                    g.fillOval(coordx.get(i), coordy.get(i), 22, 22);
                }
            }
        }
    }
}


