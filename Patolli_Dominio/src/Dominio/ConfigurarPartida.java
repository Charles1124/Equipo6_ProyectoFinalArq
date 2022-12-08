/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


/**
 *Clase que representa las configuraciones de una partida.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class ConfigurarPartida implements Serializable
{
   private int numJugadores, fichasJugador; 
   private String tipoTablero;

    public ConfigurarPartida() {
    }

    public ConfigurarPartida(int numJugadores, int fichasJugador, String tipoTablero) {
        this.numJugadores = numJugadores;
        this.fichasJugador = fichasJugador;
        this.tipoTablero = tipoTablero;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getFichasJugador() {
        return fichasJugador;
    }

    public void setFichasJugador(int fichasJugador) {
        this.fichasJugador = fichasJugador;
    }

    public String getTipoTablero() {
        return tipoTablero;
    }

    public void setTipoTablero(String tipoTablero) {
        this.tipoTablero = tipoTablero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.numJugadores;
        hash = 37 * hash + this.fichasJugador;
        hash = 37 * hash + Objects.hashCode(this.tipoTablero);
        return hash;
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
        final ConfigurarPartida other = (ConfigurarPartida) obj;
        if (this.numJugadores != other.numJugadores) {
            return false;
        }
        if (this.fichasJugador != other.fichasJugador) {
            return false;
        }
        if (!Objects.equals(this.tipoTablero, other.tipoTablero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConfiguracionPartida{" + "numJugadores=" + numJugadores + ", fichasPorJugador=" + fichasJugador + ", tipoTablero=" + tipoTablero + '}';
    }
    
}
