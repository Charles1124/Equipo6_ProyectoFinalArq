/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Tablero;
import java.util.Random;

/**
 * Clase que contiene los métodos con los posibles eventos de un jugador durante
 * una partida activa.
 *
 * @author Equipo#6 Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class EventosJugador {

    public Tablero tablero;
    public static EventosJugador eventosJugador;
    public EstrategiasJuego estrategiasJuego;

    /**
     * Constructor que inicializa los atributos.
     *
     * @param tablero Tablero de la partida en cuestión.
     */
    public EventosJugador(Tablero tablero) {
        this.tablero = tablero;
    }

    public EventosJugador() {
    }

    /**
     * Método iniciado parao obtener el atribuo de eventosJugador incializado.
     *
     * @return atributo eventosJugador.
     */
    public static EventosJugador crearEventos() {
        if (eventosJugador == null) {
            eventosJugador = new EventosJugador();
        }
        return eventosJugador;
    }

    /**
     * Método que ingresa una ficha a la partida dependiendo del resultado del
     * usuario al tirar las cañas.
     *
     * @param resultado Sumatoria de las cañas tiradas.
     */
    public void ingresarFicha(int resultado) {
        if (resultado >= 1) {

        } else {
            estrategiasJuego.pagaApuesta();
        }
    }

    /**
     * Método que elimina a un jugador dependiendo del tipo de evento sucedido.
     */
    public void eliminaJugador() {
    }

    /**
     * Método que elimina una ficha de un jugador dependiendo del tipo de evento
     * sucedido.
     */
    public void eliminaFicha() {
    }

    /**
     * Método que tira las cañas de manera aleatoria.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     * @return Devuelve el arreglo.
     */
    public int[] tirarCañas(int[] arreglo) {
        Random random = new Random();
        int caña1, caña2, caña3, caña4, caña5, resultado;
        caña1 = ((int) (random.nextDouble() * 2));
        caña2 = ((int) (random.nextDouble() * 2));
        caña3 = ((int) (random.nextDouble() * 2));
        caña4 = ((int) (random.nextDouble() * 2));
        caña5 = ((int) (random.nextDouble() * 2));

        resultado = caña1 + caña2 + caña3 + caña4 + caña5;

        arreglo[0] = caña1;
        arreglo[1] = caña2;
        arreglo[2] = caña3;
        arreglo[3] = caña4;
        arreglo[4] = caña5;
        arreglo[5] = resultado;

        return arreglo;

    }

    /**
     * Método que indica que tipo de evento sucede cuando una ficha llega a una
     * meta.
     */
    public void fichaMeta() {
    }
}
