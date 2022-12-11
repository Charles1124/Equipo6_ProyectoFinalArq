/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que extiende de hilo donde se utilizan multihilos para el server socket.
 *
 * @author Carlos A. Valle Encinas
 */
public class ServidorMultiHilo extends Thread
{
    private ServidorHilo serverHilo;
    private Socket socket;
    private PrintWriter printWriter;

    public ServidorMultiHilo(Socket socket,ServidorHilo serverHilo) {
        this.serverHilo = serverHilo;
        this.socket = socket;
    }
    @Override
    public void run(){
        try{
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.printWriter=new PrintWriter(socket.getOutputStream(),true);
            
        }catch(IOException e){}
    }
}
