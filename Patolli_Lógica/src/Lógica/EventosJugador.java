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
public class EventosJugador 
{
  public static EventosJugador eventosJugador;
  public EstrategiasJuego estrategiasJuego;

    /**
     * Constructor Vacío.                          
     */
   public EventosJugador(Tablero tablero){
   }

   public EventosJugador(){
   }

   public static EventosJugador crearEventos(){
       if(eventosJugador==null){
           eventosJugador= new EventosJugador();
       }
       return eventosJugador;
   }

   public void ingresarFicha(int resultado){
        if(resultado>=1){

        }
        else{
            estrategiasJuego.pagaApuesta();
        }
   } 

   public void eliminaJugador(){
   }

   public void eliminaFicha(){
   }

    /**
     * Método que simula las tiradas de caña con números al azar y los guarda en
     * un arreglo.
     *
     * @param arreglo Arreglo con los números obtenidos y su resultado.
     * @return Devuelve un arreglo.
     */
   public int[] tirarCañas(int[] arreglo){
        Random random=new Random();
        int caña1, caña2, caña3, caña4, caña5, resultado;
        caña1= ((int)(random.nextDouble()*2));
        caña2= ((int)(random.nextDouble()*2));
        caña3= ((int)(random.nextDouble()*2)); 
        caña4= ((int)(random.nextDouble()*2)); 
        caña5= ((int)(random.nextDouble()*2));

        resultado= caña1+caña2+caña3+caña4+caña5;

        arreglo[0]= caña1;
        arreglo[1]= caña2;
        arreglo[2]= caña3; 
        arreglo[3]= caña4;
        arreglo[4]= caña5;
        arreglo[5]= resultado;

        return arreglo;
       
   }

   public void fichaMeta(){
   }
}
