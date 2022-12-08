/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *
 * @author Equipo #6
 */
public interface ILogica {

    public void ingresarFicha(int resultado);

    public void eliminaJugador();

    public void eliminaFicha();

    public void fichaMeta();

    public int[] tirarCañas(int[] arreglo);

    public void pagaApuesta();

    public void mueveFicha();
}
