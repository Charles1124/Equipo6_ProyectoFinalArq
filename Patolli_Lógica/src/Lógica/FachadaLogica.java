/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *Clase fachada que implementa la interfaz ILogica.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class FachadaLogica implements ILogica
{ 
    /**
     * Atributo tipo EventosJugador.
     */
    private EventosJugador eventosJugador;

    /**
     * Constructor de la Clase.
     */
    public FachadaLogica() {
        eventosJugador = EventosJugador.crearEventos();

    }

    /**
     * Método que tira las cañas de manera aleatoria.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     * @return Devuelve el arreglo.
     */
    @Override
    public int[] tirarCañas(int[] arreglo) {
        this.eventosJugador.tirarCañas(arreglo);
        return arreglo;
    }

    /**
     * Método que representa cualquier acción de un jugador en la partida.
     */
    @Override
    public void AccionEvento(int[] arreglo) {
        this.eventosJugador.AccionEvento(arreglo);
    }
}
