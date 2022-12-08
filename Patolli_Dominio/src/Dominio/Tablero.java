/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
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
    protected ConfigurarPartida configurar;
    private int turno=0;

    public Tablero() {
    }

    public Tablero(List<Jugador> listaJugadores, ConfigurarPartida configurar) {
        this.listaJugadores = listaJugadores;
        this.configurar = configurar;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public ConfigurarPartida getConfigurar() {
        return configurar;
    }

    public void setConfigurar(ConfigurarPartida configurar) {
        this.configurar = configurar;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tablero other = (Tablero) obj;
        if (!Objects.equals(this.listaJugadores, other.listaJugadores)) {
            return false;
        }
        return true;
    }

    public ConfigurarPartida getConfiguracion() {
        return configurar;
    }

    public void setConfiguracion(ConfigurarPartida configurar) {
        this.configurar = configurar;
    }

    @Override
    public String toString() {
        return "Partida{" + "listaJugadores=" + listaJugadores + ", configuracion=" + configurar + '}';
    }
}
