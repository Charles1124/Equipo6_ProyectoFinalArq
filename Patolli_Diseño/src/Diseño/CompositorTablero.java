/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase que permite dibujar el CompositorTablero en base a la composición de casillas y
 sus respectivas coordenadas.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class CompositorTablero implements Dibujado {
     
     private int aspa;
     private List<Dibujado> listaDibujo = new ArrayList<>();

//Metodo que se encarga de dibujar las figuras
    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < listaDibujo.size(); i++) {
            Dibujado obtener = listaDibujo.get(i);
            obtener.paint(g);
        } 
    }

    public CompositorTablero(int aspa) {
       this.aspa= aspa;
    }

    public void addElemento(Dibujado dibujado) {
        this.listaDibujo.add(dibujado);
    }
 }
