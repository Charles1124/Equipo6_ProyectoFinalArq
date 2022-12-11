/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que representa a una Casilla.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Casilla implements Serializable
{
    /**
     * Fichas en juego.
     */
    private Ficha ficha; 

    /**
     * Tipo de casilla.
     */
    private TipoCasilla tipoCasilla;

    /**
     * Constructor Vacío.
     */
    public Casilla() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param ficha Fichas en el juego.
     * @param tipoCasilla tipo de casilla.
     */
    public Casilla(Ficha ficha, TipoCasilla tipoCasilla) {
        this.ficha = ficha;
        this.tipoCasilla = tipoCasilla;
    }

    /**
     * Método para obtener  las fichas ubicadas en las casillas.
     */
    public Ficha getFicha() {
        return ficha;
    }

    /**
     * Método para establecer las fichas ubicadas en las casillas.
     *
     * @param ficha lista de las fichas.
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    /**
     * Método que obtiene el tipo de casilla.
     */
    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    /**
     * Método que establece el tipo de casilla.
     *
     * @param tipoCasilla tipo de casilla.
     */
    public void setTipoCasilla(TipoCasilla tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    /**
     * Método que se encarga de regresar una cadena de texto con los datos de la 
     * casilla.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Casilla{" + "Casilla=" + tipoCasilla + "Ficha=" + ficha +'}';
    }
}
