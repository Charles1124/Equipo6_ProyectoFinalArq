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
     * Método que tira las cañas de manera aleatoria.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     * @return Devuelve el arreglo.
     */
    public int[] tirarCañas(int[] arreglo);  
 
    /**
     * Método que representa cualquier acción en el juego.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     */
    public void AccionEvento(int[] arreglo);
}
