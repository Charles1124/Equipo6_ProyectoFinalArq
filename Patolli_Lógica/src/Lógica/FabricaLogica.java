/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 * Método que se encarga de Fabricar la fachada creando la lógica del juego. 
 * e inicializar el atributo de tipo ILogica.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class FabricaLogica {
    private static ILogica logica; 

    /**
     * Método estatico que ayuda a crear la Fachada de la lógica.
     *
     * @return el atributo de tipo ILogica.
     */
    public static ILogica crearLogica() {
        if (logica == null) {
            logica = new FachadaLogica();
        }
        return logica;
    }
}
