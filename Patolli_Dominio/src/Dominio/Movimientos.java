/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *Clase que representa los movimientos hechos por un jugador.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Movimientos 
{
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
     */
    public Movimientos(Jugador jugador, Ficha ficha, Apuesta apuesta) {
        this.jugador = jugador; 
        this.ficha= ficha; 
        this.apuesta= apuesta;
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
  
}
