/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import Lógica.EventosJugador;
import Presentación.PantallaPartida;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Clase que extiende de Thread que permite transmitir a otro usuario mediante
 * la conexión de sockets.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class ConexionTransmitir extends Thread
{
    String host= "127.0.0.1";
    int puertoRecibe, puertoObjeto; 
    PantallaPartida pantallaPartida;
    EventosJugador eventosJugador;

    /**
     * Constructor que inicializa los atributos de la clase.
     *
     * @param puertoRecibe puerto que se recibe para la conexión.
     * @param puertoObjeto puerto objetivo para la conexión.
     * @param pantallaPartida frame de pantalla partida.
     * @param eventosJugador Clase EventosJugador del componente de lógica.
     */
    public ConexionTransmitir(int puertoRecibe, int puertoObjeto, PantallaPartida pantallaPartida, EventosJugador eventosJugador) {
        this.puertoRecibe = puertoRecibe;
        this.puertoObjeto = puertoObjeto;
        this.pantallaPartida = pantallaPartida;
        this.eventosJugador = eventosJugador;
    }

    /**
     * Método run de la clase Thread que se conecta con el socket oyente y manda
     * información serializada a través de un Output.
     */
    @Override
    public void run(){
       try{
         Socket sk1= new Socket(host, puertoObjeto);
         OutputStream output= sk1.getOutputStream();
         ObjectOutputStream objOut= new ObjectOutputStream(output);

         try{
            objOut.writeObject(eventosJugador); 
            objOut.flush();
            sk1.close();
         }
         catch(Exception e){
                System.out.println("Exception "+e);
          }
       }
       catch(Exception e){
           System.out.println("Error! "+e);
        }
    }
}
