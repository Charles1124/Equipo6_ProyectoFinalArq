/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *
 * @author cyt88
 */
public class FachadaLogica implements ILogica
{
    private EventosJugador eventosJugador; 

    public FachadaLogica(){
        eventosJugador= EventosJugador.crearEventos();
         
    }

    @Override 
    public void ingresarFicha(int resultado){
      this.eventosJugador.ingresarFicha(resultado);
    }

    @Override
    public void eliminaJugador(){}

    @Override
    public void eliminaFicha(){}

    @Override
    public void fichaMeta(){}

    @Override
    public int[] tirarCañas(int[] arreglo){
        this.eventosJugador.tirarCañas(arreglo);
        return arreglo;
    }

    @Override
    public void pagaApuesta(){}

    @Override
    public void mueveFicha(){}
}
