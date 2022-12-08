/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 * Clase que implementa la interfaz EstrategiasJuego para indicar un movimiento
 * de un solo turno o un solo pago de apuesta.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class MovimientosSencillos implements EstrategiasJuego
{
    /**
     * Método que indica pagar una apuesta con su cantidad correspondiente.
     */
    @Override
    public void pagaApuesta() {
    }

    /**
     * Método que mueve la fichca dependiendo del resultado obtenido al
     * lanzamiento de cañas.
     *
     * @param resultado Resultado de la tirada de cañas.
     */
    @Override
    public void mueveFicha(int resultado) {
        int x, y, opcion;

    }
}
