/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa al Tablero.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Tablero implements Serializable
{

    /**
     * Lista de la cantidad de jugadores en la partida.
     */
    protected List<Jugador> listaJugadores;

    /**
     * Lista de la cantidad de casillas;
     */
    protected List<Casilla> casillas;
    private int turno = 0;

    /**
     * Constructor Vacío.
     */
    public Tablero() {
    }

    /**
     * Constructor que incializa los atributos de la clase.
     *
     * @param listaJugadores lista de jugadores en una partida.
     * @param configurar configuraciones de una partida.
     */
    public Tablero(List<Jugador> listaJugadores, List<Casilla> casillas) {
        this.listaJugadores = listaJugadores;
        this.casillas= casillas;
    }

    /**
     * Método que obtiene la lista de jugadores.
     *
     * @return Devuelve la lista de jugadores.
     */
    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    /**
     * Método que establece la lista de jugadores.
     *
     * @param listaJugadores lista de jugadores en la partida.
     */
    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    /**
     * Método que obtiene la lista de casillas.
     *
     * @return Devuelve una lista de casillas.
     */
    public List<Casilla> getCasillas() {
        return casillas;
    }

    /**
     * Método que establece una lista de las casillas del tablero.
     *
     * @param casillas Casillas pertenecientes a una lista.
     */
    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }


    /**
     * Método que obtiene el turno del jugador.
     *
     * @return Devuelve el turno.
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Método que establece el turno del jugador.
     *
     * @param turno Turno del jugador.
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * Método toString que realiza una cadena de texto.
     *
     * @return Devuelve una cadena de texto con los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Partida{" + "listaJugadores=" + listaJugadores + ", lstaCasillas=" + casillas + '}';
    }
}
