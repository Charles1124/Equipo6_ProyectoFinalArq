/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa al Jugador.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Jugador implements Serializable{

    /**
     * Lista de las fichas que tiene en una partida actual.
     */
    protected List<Ficha> ficha;
 
    /**
    * Color de las fichas en especifico.
    */
    protected Color color;

    /**
     * Nombre del jugador
     */
    protected String nombre;

    /**
     * Ficha actual del jugador.
     */
    private int fichaActual;

    /**
     * Constructor Vacío.
     */
    public Jugador() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param ficha fichas que tiene el jugador.
     * @param color color de las fichas del jugador.
     */
    public Jugador(List<Ficha> ficha, Color color) {
        this.ficha= ficha; 
        this.color= color;
    }

    /**
     * Método para la lista de fichas del jugador
     */
    public List<Ficha> getFichas() {
        return ficha;
    }

    /**
     * Establece una lista con las fichas del jugador en cuestión.
     */
    public void setFichas(ArrayList<Ficha> fichas) {
        this.ficha = fichas;
    }

    /**
     * Obtiene el color de la ficha.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color de la ficha.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtiene el nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene la ficha actual.
     */
    public int getFichaActual() {
        return fichaActual;
    }

    /**
     * Método que establece la ficha actual.
     */
    public void setFichaActual(int fichaActual) {
        this.fichaActual = fichaActual;
    }


    /**
     * Método que se encarga de regresar una cadena de texto con los datos del 
     * jugador.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + nombre + "Color=" + color + '}';
    }
    
}
