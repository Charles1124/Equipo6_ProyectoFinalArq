/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseño;


import java.util.ArrayList;
import java.util.List;


/**
 * Clase que hereda de Dibujado y representa toda la composición de casillas
 * en el tablero
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class CompositorTablero extends Dibujado {
     
    private List<Dibujado> listaDibujo = new ArrayList<>();

    /**
     * Constructor que hereda de su clase padre.
     *
     * @param coordenada coordenada correspondiente del dibujo
     */
    public CompositorTablero(int coordenada) {
        super(coordenada);
    }

    /**
     * Método abstracto que se encarga de ir dibujando las casillas
     * correspondiente almacenadas en a lista.
     */
    @Override
    public void dibujar() {
        for (int i = 0; i < listaDibujo.size(); i++) {
            Dibujado obtener = listaDibujo.get(i);
            obtener.dibujar();
        }
    }

    /**
     * Método que agrega un nuevo elemento a la lista.
     */
    public void addElemento(Dibujado dibujado) {
        this.listaDibujo.add(dibujado);
    }
 }
