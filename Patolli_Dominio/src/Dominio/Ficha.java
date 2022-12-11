/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que representa a una ficha.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Ficha implements Serializable
{
    /**
     * Atributos de las coordenadas correspondientes de una ficha
     */
    private double coordenadaX, coordenadaY;

    /**
     * Casilla en la que se ubica una ficha.
     */
    protected Casilla casilla; 

    /**
     * Tablero donde las fichas estan en juego.
     */
    protected Tablero tablero; 

    /**
     * Jugador responsable de la ficha.
     */
    protected Jugador jugador; 

    /**
     * Color de la ficha
     */
    private Color color;

    /**
     * Lista de movimientos aplicados a una ficha.
     */
    protected List<Movimientos> movimientos;


    /**
     * Constructor Vacío.
     */
    public Ficha() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param color color de la ficha.
     */
    public Ficha(Color color) {
        this.color = color;
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param color color de la ficha.
     * @param casilla casilla del tablero.
     * @param tablero tablero en juego.
     * @param jugador jugador responsable.
     * @param movimientos que se aplican a la ficha. 
     */
    public Ficha(Casilla casilla, Tablero tablero, Jugador jugador, Color color, List<Movimientos> movimientos) {
        this.casilla = casilla;
        this.tablero = tablero;
        this.jugador = jugador;
        this.color = color;
        this.movimientos= movimientos;
    }

    /**
     * Constructor que incializa los atributos.
     *
     * @param coordenadaX coordenada x.
     * @param coordenadaY coordenada y.
     */
    public Ficha(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }


    /**
     * Método que obtiene la casilla donde se ubica la ficha.
     */
    public Casilla getCasilla() {
        return casilla;
    }

    /**
     * Método que establece una casilla donde se ubica la ficha.
     *
     * @param casilla casilla del tablero.
     */
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    /**
     * Método que obtiene el tablero donde las fichas estan en juego.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Método que establece el tablero donde las fichas estan en juego.
     *
     * @param tablero tablero en juego.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Método que obtiene el jugador responsable de la ficha.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método para establecer el jugador responsable de una ficha.
     *
     * @param jugador jugador responsable.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Método que obtiene el color de la ficha.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Método que establece el color de la ficha.
     *
     * @param color color de la ficha.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método que obtiene los movimientos de una ficha.
     */
    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    /**
     * Método que establece los movimientos a una ficha.
     */
    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * Método que obtiene una coordenada x.
     */
    public double getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Método que establece una coordenada x.
     */
    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Método que obtiene una coordenada y.
     */
    public double getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Método que establece una coordenada x.
     */
    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }


    /**
     * Método que se encarga de regresar una cadena de texto con los datos de la 
     * ficha.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Ficha{" + "Color=" + color +'}';
    }
}
