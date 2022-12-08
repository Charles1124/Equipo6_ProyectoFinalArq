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
     * Método que ingresa una ficha a la partida dependiendo del resultado del
     * usuario al tirar las cañas.
     *
     * @param resultado Sumatoria de las cañas tiradas.
     */
    @Override
    public void ingresarFicha(int resultado) {
        this.eventosJugador.ingresarFicha(resultado);
    }

    /**
     * Método que elimina a un jugador dependiendo del tipo de evento sucedido.
     */
    @Override
    public void eliminaJugador() {
    }

    /**
     * Método que elimina una ficha de un jugador dependiendo del tipo de evento
     * sucedido.
     */
    @Override
    public void eliminaFicha() {
    }

    /**
     * Método que indica que tipo de evento sucede cuando una ficha llega a una
     * meta.
     */
    @Override
    public void fichaMeta() {
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
}
