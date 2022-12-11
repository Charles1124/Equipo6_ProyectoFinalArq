/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import Dominio.Tablero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *Clase cliente que representa a los usuarios que se unen a una partida.
 * @author Carlos A. Valle Encinas
 */
public class Cliente {
    private Socket socket;
    private BufferedReader bufferedReader;   
    private BufferedWriter bufferedWritter;
    private ObjectInputStream stream;
    private String nombre; 
  
    public Cliente(Socket socket, String nombre){
          try{
          this.socket= socket;
          this.bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
          this.bufferedWritter= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
          this.nombre= nombre;
           }
           catch(IOException e){
               System.out.println("Ha surgido un error de conexión..."+e);
           }  
    }

    public void escuchar(){
        new Thread(new Runnable(){
             public void run(){
                String tablero;
                 while(socket.isConnected()){
                    try{
                       tablero= bufferedReader.readLine();
                        System.out.println("Uniendo partida...  ");
                    }
                    catch(IOException e){
                          e.printStackTrace();
                    }
                 }
             }
         }).start();
    }
}
