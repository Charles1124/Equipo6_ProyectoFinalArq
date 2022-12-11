/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

/**
 *Clase que representa los movimientos hechos por un jugador.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Movimientos implements Serializable
{
    /**
     * Movimientos en x.
     */
    private double x;

    /**
     * Movimientos en y.
     */
    private double y;

    /**
     * Jugador que realiza los movimientos.
     */
    protected Jugador jugador; 
 
    /**
    * Ficha que aplica los movimientos. 
    */ 
    protected Ficha ficha;

    /*
    * Apuesta a realizar dependiendo el movimiento. 
    */
    protected Apuesta apuesta;

    /**
     * Constructor vacío.
     */
    public Movimientos() {
    }

    

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param jugador que realiza los movimientos.
     * @param ficha que aplica los movimientos. 
     * @param apuesta que se realiza dependiendo del movimiento. 
     * @param x movimientos lado x.
     * @param y movimientos lado y.
     */
    public Movimientos(Jugador jugador, Ficha ficha, Apuesta apuesta, double x, double y) {
        this.jugador = jugador; 
        this.ficha= ficha; 
        this.apuesta= apuesta;
        this.x= x; 
        this.y= y;
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param x movimientos lado x.
     * @param y movimientos lado y.
     */
    public Movimientos(double x, double y) {
        this.x= x; 
        this.y= y;
    }

    /**
     * Método que obtiene le jugador que realiza la lista de movimientos.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método que establece al jugador que realiza la lista de movimientos.
     *
     * @param jugador Jugador.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }   

    /**
     * Método que obtiene la ficha que aplica los movimientos.
     */
    public Ficha getFicha() {
        return ficha;
    }

    /**
     * Método que establece la ficha que aplica los movimientos.
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    /**
     * Método que obtiene una apuesta dependiendo del movimiento realizado.
     */
    public Apuesta getApuesta() {
        return apuesta;
    }

    /**
     * Método que establece una apuesta dependiendo del movimiento realizado.
     */
    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    /**
     * Método que obtiene una coordenada en x.
     *
     * @return movimiento en coordenada x.
     */
    public double getX() {
        return x;
    }

    /**
     * Método establece una coordenada en x.
     *
     * @param x movimiento en coordenada x.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Método que obtiene una coordenada en y.
     *
     * @return movimiento en coordenada y.
     */
    public double getY() {
        return y;
    }

    /**
     * Método que establece una oordenada en y.
     *
     * @param y movimiento en coordenada y.
     */
    public void setY(double y) {
        this.y = y;
    }


}
