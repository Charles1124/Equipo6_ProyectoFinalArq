/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 *Clase que representa la Apuesta.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Apuesta 
{
    /**
     * Cantidad a Apostar.
     */
    private int cantidad;
    
    /**
     * Apuesta del Jugador
     */
    protected Jugador jugador;

     /**
     * Lista de movimientos aplicados a una ficha.
     */
    protected List<Movimientos> movimientos;

    /**
     * Constructor vacío
     */
    public Apuesta() 
    {
 
    }

    /**
     * Constructor que inicializa los atributos por los valores dados por los
     * parámetros
     *
     * @param cantidad cantidad de la apuesta.
     */
    public Apuesta(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Constructor que inicializa los atributos por los valores dados por los
     * parámetros
     *
     *@param jugador Jugador que realiza la apuesta.
     * @param cantidad cantidad de la apuesta.  
     * @param movimientos que hacen dependencia a una apuesta.
     */
    public Apuesta(Jugador jugador,int cantidad, List<Movimientos> movimientos) {
        this.cantidad = cantidad;
        this.jugador= jugador;
        this.movimientos= movimientos;
    }

    /**
     * Método para obtener la cantidad de la apuesta.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método para establecer la cantidad de la apuesta.
     *
     * @param cantidad cantidad a apostar.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método para obtener el jugador que realizo la apuesta.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método para establecer la apuesta del jugador.
     *
     * @param jugador Jugado que apostó.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Método que obtiene los movimientos para una apuesta.
     */
    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    /**
     * Método que establece los movimientos para la dependencia de una apuesta.
     */
    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }
 
    /**
     * Método que se encarga de regresar una cadena de texto con los datos de la
     * apuesta.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Apuesta{" + "Cantidad=" + cantidad +'}';
    }
    
}
