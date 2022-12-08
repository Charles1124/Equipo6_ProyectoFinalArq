/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 * Interfaz ILógica que es implementada por la fachada en base a los métodos
 * correspondientes.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public interface ILogica {
/**
     * Método que ingresa una ficha a la partida dependiendo del resultado del
     * usuario al tirar las cañas.
     *
     * @param resultado Sumatoria de las cañas tiradas.
     */
    public void ingresarFicha(int resultado);

    /**
     * Método que elimina a un jugador dependiendo del tipo de evento sucedido.
     */
    public void eliminaJugador();

    /**
     * Método que elimina una ficha de un jugador dependiendo del tipo de evento
     * sucedido.
     */
    public void eliminaFicha();

    /**
     * Método que indica que tipo de evento sucede cuando una ficha llega a una
     * meta.
     */
    public void fichaMeta();

    /**
     * Método que tira las cañas de manera aleatoria.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     * @return Devuelve el arreglo.
     */
    public int[] tirarCañas(int[] arreglo);  
}
