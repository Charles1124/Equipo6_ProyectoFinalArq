/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que extiende de hilo donde el usuario principal crea la partida e
 * inicializa el server socket.
 *
 * @author Carlos A. Valle Encinas
 */
public class ServidorHilo extends Thread{
    private ServerSocket serverSocket;
    private Set<ServidorMultiHilo> serverMultiHilo=new HashSet<ServidorMultiHilo>();
    public ServidorHilo(int puerto)throws IOException{
        serverSocket=new ServerSocket(puerto);
    }

   public ServidorHilo(ServerSocket serverSk){
      this.serverSocket= serverSk;
   }
    
    @Override
    public void run(){
        try{
            while(true){
                ServidorMultiHilo servidorMultiHilo=new ServidorMultiHilo(serverSocket.accept(),this);
                servidorMultiHilo.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Set<ServidorMultiHilo> getServerMultiHilo(){
        return serverMultiHilo;
  
   }
}
