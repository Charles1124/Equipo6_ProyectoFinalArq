/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import java.util.Random;


/**
 * Clase padre que contiene el método del lanzamiento de cañas, además utiliza 
 * un patrón singlenton para utilizar la fachada.
 *
 * @author Equipo#6 Carlos A. Valle Encinas - David Sotelo Palafox
 */
public class EventosJugador {
public static EventosJugador eventosJugador;   

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

    public void AccionEvento(int[] arreglo){

    } 
}
