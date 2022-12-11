/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;


/**
 *Clase que representa las configuraciones de una partida.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class ConfigurarPartida implements Serializable
{
    /**
     * Atributos necesarios para la configuración de una partida.
     */
    private int numJugadores, fichasJugador;
    private String tipoTablero;

    /**
     * Constructor Vacío.
     */
    public ConfigurarPartida() {
    }

    /**
     * Constructor que inicializa los atributos.
     *
     * @param numJugadores Cantidad de jugadores en la partida.
     * @param fichasJugador Fichas de cada jugador.
     * @param tipoTablero Tipo de tablero a jugar.
     */
    public ConfigurarPartida(int numJugadores, int fichasJugador, String tipoTablero) {
        this.numJugadores = numJugadores;
        this.fichasJugador = fichasJugador;
        this.tipoTablero = tipoTablero;
    }

    /**
     * Método para obtener el número de jugadores en una partida.
     *
     * @return Número de jugadores.
     */
    public int getNumJugadores() {
        return numJugadores;
    }

    /**
     * Método para establecer el número de jugadores en una partida.
     *
     * @param numJugadores Número de jugadores.
     */
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    /**
     * Método para obtener las fichas para cada jugador.
     *
     * @return Número de fichas por jugador
     */
    public int getFichasJugador() {
        return fichasJugador;
    }

    /**
     * Método para establecer las fichas para cada jugador.
     *
     * @param fichasJugador Número de fichas por jugador
     */
    public void setFichasJugador(int fichasJugador) {
        this.fichasJugador = fichasJugador;
    }

    /**
     * Método para obtener el tipo de tablero en la partida.
     *
     * @return tipo de tablero
     */
    public String getTipoTablero() {
        return tipoTablero;
    }

    /**
     * Método para establecer el tipo de tablero en la partida.
     *
     * @param tipoTablero tipo de tablero.
     */
    public void setTipoTablero(String tipoTablero) {
        this.tipoTablero = tipoTablero;
    }

    /**
     * Método toString que realiza una cadena de texto.
     *
     * @return Devuelve una cadena de texto con los atributos de la clase.
     */
    @Override
    public String toString() {
        return "ConfiguracionPartida{" + "numJugadores=" + numJugadores + ", fichasPorJugador=" + fichasJugador + ", tipoTablero=" + tipoTablero + '}';
    }
    
}
