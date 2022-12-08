/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import Dominio.Tablero;
import Lógica.EventosJugador;
import Presentación.PantallaPartida;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyt88
 */
public class ConexionEscuchar extends Thread
{
    public ServerSocket serverSk;
    int puerto; 
    PantallaPartida pantallaPartida;
    int nombre;


   public ConexionEscuchar(PantallaPartida pantallaPartida, int puerto, int llave){
      this.puerto= puerto;  
      this.pantallaPartida= pantallaPartida;
      try {
            serverSk = new ServerSocket(puerto);
        } catch (IOException ex) {
            Logger.getLogger(ConexionEscuchar.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

   public ConexionEscuchar() {
        try {
            serverSk = new ServerSocket(puerto);
        } catch (IOException ex) {
            Logger.getLogger(ConexionEscuchar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   @Override
   public void run(){
      Socket sk; 
      
      try{
         while((sk= serverSk.accept())!=null){
             InputStream input= sk.getInputStream();
             if(input!=null){
             InputStream inputS= sk.getInputStream();
             ObjectInputStream objInput= null; 
             try{
               objInput= new ObjectInputStream(inputS);
               Tablero tablero= (Tablero) objInput.readObject();
               if(tablero!=null){
                  pantallaPartida.setEvento(tablero, nombre);
               }
             }
             catch(Exception e){
            }
           }
         }
      }
      catch(Exception e){
      }
   }
}
