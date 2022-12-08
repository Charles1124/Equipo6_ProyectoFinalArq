/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import Dominio.Tablero;
import Presentación.PantallaPartida;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que extiende de Thread que permite establecer al usuario que escucha en
 * la conexión.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class ConexionEscuchar extends Thread
{
    public ServerSocket serverSk;
    int puerto; 
    PantallaPartida pantallaPartida;
    int nombre;

/**
     * Constructor que inicializa los atributos de la clase.
     *
     * @param pantallaPartida Frame de la pantalla de la partida.
     * @param puerto Puertos para la conexión.
     */
    public ConexionEscuchar(PantallaPartida pantallaPartida, int puerto) {
        this.puerto = puerto;
        this.pantallaPartida = pantallaPartida;
        try {
            serverSk = new ServerSocket(puerto);
        } catch (IOException ex) {
            Logger.getLogger(ConexionEscuchar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructor que vacío.
     */
    public ConexionEscuchar() {
        try {
            serverSk = new ServerSocket(puerto);
        } catch (IOException ex) {
            Logger.getLogger(ConexionEscuchar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método run de la clase Thread que acepta la conexión de los Sockets y
     * escucha mediante un Input.
     */
    @Override
    public void run() {
        Socket sk;

        try {
            while ((sk = serverSk.accept()) != null) {
                InputStream input = sk.getInputStream();
                if (input != null) {
                    InputStream inputS = sk.getInputStream();
                    ObjectInputStream objInput = null;
                    try {
                        objInput = new ObjectInputStream(inputS);
                        Tablero tablero = (Tablero) objInput.readObject();
                        if (tablero != null) {
                            pantallaPartida.setEvento(tablero, nombre);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
