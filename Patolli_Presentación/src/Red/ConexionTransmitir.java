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
 *
 * @author cyt88
 */
public class ConexionTransmitir extends Thread
{
    String host= "127.0.0.1";
    int puertoRecibe=5000, puertoObjeto=5001; 
    PantallaPartida pantallaPartida;
    EventosJugador eventosJugador;

    public ConexionTransmitir(int puertoRecibe, int puertoObjeto, PantallaPartida pantallaPartida, EventosJugador eventosJugador) {
        this.puertoRecibe = puertoRecibe;
        this.puertoObjeto = puertoObjeto;
        this.pantallaPartida = pantallaPartida;
        this.eventosJugador = eventosJugador;
    }

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
