/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *Interfaz que contiene 2 métodos de estrategia de juego.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public interface EstrategiasJuego {

    /**
     * Método que indica pagar una apuesta con su cantidad correspondiente.
     */
    public void pagaApuesta();

    /**
     * Método que mueve la fichca dependiendo del resultado obtenido al
     * lanzamiento de cañas.
     *
     * @param resultado Resultado de la tirada de cañas.
     */
    public void mueveFicha(int resultado);
}
