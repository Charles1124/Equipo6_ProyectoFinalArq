/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Ficha;
import Dominio.Jugador;
import Dominio.Movimientos;
import Dominio.Tablero;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *Método que representa la eliminación de una ficha en una partida. 
 * @author Carlos A. Valle Encinas. 
 */
public class EliminarFicha extends EventosJugador
{
     private List<Movimientos> listaMovimientos;
    Tablero tablero;

    /**
     * Constructor que incializa las coordenadas.
     */
    public EliminarFicha() {

        this.listaMovimientos = new ArrayList<>();

        listaMovimientos.add(new Movimientos(675, 450)); //Semicirculo
        listaMovimientos.add(new Movimientos(650, 420));
        listaMovimientos.add(new Movimientos(625, 400));
        listaMovimientos.add(new Movimientos(610, 380)); //Triangulo
        listaMovimientos.add(new Movimientos(590, 365));
        listaMovimientos.add(new Movimientos(565, 338));
        listaMovimientos.add(new Movimientos(540, 310));
        listaMovimientos.add(new Movimientos(510, 282));
        listaMovimientos.add(new Movimientos(482, 255)); //Centro
        listaMovimientos.add(new Movimientos(510, 228));
        listaMovimientos.add(new Movimientos(540, 200));
        listaMovimientos.add(new Movimientos(565, 172));
        listaMovimientos.add(new Movimientos(590, 145));
        listaMovimientos.add(new Movimientos(615, 138)); //Triangulo
        listaMovimientos.add(new Movimientos(650, 90));
        listaMovimientos.add(new Movimientos(675, 60)); //Semicirculo
        listaMovimientos.add(new Movimientos(620, 115));
        listaMovimientos.add(new Movimientos(650, 38)); //Semicirculo
        listaMovimientos.add(new Movimientos(620, 60));
        listaMovimientos.add(new Movimientos(595, 90));
        listaMovimientos.add(new Movimientos(580, 100)); //Triangulo
        listaMovimientos.add(new Movimientos(565, 120));
        listaMovimientos.add(new Movimientos(540, 145));
        listaMovimientos.add(new Movimientos(510, 170));
        listaMovimientos.add(new Movimientos(480, 200));
        listaMovimientos.add(new Movimientos(455, 228)); //Centro
        listaMovimientos.add(new Movimientos(430, 200));
        listaMovimientos.add(new Movimientos(400, 170));
        listaMovimientos.add(new Movimientos(372, 145));
        listaMovimientos.add(new Movimientos(348, 120));
        listaMovimientos.add(new Movimientos(330, 100)); //Triangulo
        listaMovimientos.add(new Movimientos(315, 90));
        listaMovimientos.add(new Movimientos(290, 60));
        listaMovimientos.add(new Movimientos(260, 35)); //Semicirculo
        listaMovimientos.add(new Movimientos(235, 60)); //Semicirculo
        listaMovimientos.add(new Movimientos(260, 90));
        listaMovimientos.add(new Movimientos(290, 115));
        listaMovimientos.add(new Movimientos(300, 130)); //Triangulo
        listaMovimientos.add(new Movimientos(320, 145));
        listaMovimientos.add(new Movimientos(345, 172));
        listaMovimientos.add(new Movimientos(370, 200));
        listaMovimientos.add(new Movimientos(400, 230));
        listaMovimientos.add(new Movimientos(428, 255)); //Centro
        listaMovimientos.add(new Movimientos(400, 280));
        listaMovimientos.add(new Movimientos(370, 310));
        listaMovimientos.add(new Movimientos(345, 338));
        listaMovimientos.add(new Movimientos(320, 364));
        listaMovimientos.add(new Movimientos(300, 380)); //Triangulo
        listaMovimientos.add(new Movimientos(290, 395));
        listaMovimientos.add(new Movimientos(260, 420));
        listaMovimientos.add(new Movimientos(235, 450)); //Semicirculo
        listaMovimientos.add(new Movimientos(260, 474)); //Semicirculo
        listaMovimientos.add(new Movimientos(290, 450));
        listaMovimientos.add(new Movimientos(312, 420));
        listaMovimientos.add(new Movimientos(330, 410)); //Triangulo
        listaMovimientos.add(new Movimientos(345, 390));
        listaMovimientos.add(new Movimientos(370, 365));
        listaMovimientos.add(new Movimientos(400, 340));
        listaMovimientos.add(new Movimientos(430, 310));
        listaMovimientos.add(new Movimientos(455, 285)); //Centro
        listaMovimientos.add(new Movimientos(480, 310));
        listaMovimientos.add(new Movimientos(510, 340));
        listaMovimientos.add(new Movimientos(540, 365));
        listaMovimientos.add(new Movimientos(568, 392));
        listaMovimientos.add(new Movimientos(580, 410)); //Triangulo
        listaMovimientos.add(new Movimientos(595, 420));
        listaMovimientos.add(new Movimientos(620, 450));
        listaMovimientos.add(new Movimientos(650, 472)); //Semicirculo
    }

    /**
     * Método que tira las cañas de manera aleatoria.
     *
     * @param arreglo arreglo con los resultados de cada caña.
     * @return Devuelve el arreglo.
     */
     @Override
    public int[] tirarCañas(int[] arreglo) {
        Random random = new Random();
        int caña1, caña2, caña3, caña4, caña5, resultado;
        caña1 = ((int) (random.nextDouble() * 2));
        caña2 = ((int) (random.nextDouble() * 2));
        caña3 = ((int) (random.nextDouble() * 2));
        caña4 = ((int) (random.nextDouble() * 2));
        caña5 = ((int) (random.nextDouble() * 2));

        resultado = caña1 + caña2 + caña3 + caña4 + caña5;

        arreglo[0] = caña1;
        arreglo[1] = caña2;
        arreglo[2] = caña3;
        arreglo[3] = caña4;
        arreglo[4] = caña5;
        arreglo[5] = resultado;

        AccionEvento(arreglo);
        return arreglo;

    }

    /**
     * Método de AccionEvento que representa el movimiento de una ficha en una
     * casilla central.
     *
     * @param arreglo arreglo del resultado de cañas.
     */
    @Override
    public void AccionEvento(int[] arreglo){
       int caña1=0, caña2=0, caña3=0, caña4=0, caña5=0, resultado=0; 
        arreglo[0]= caña1;
        arreglo[1]= caña2;
        arreglo[2]= caña3; 
        arreglo[3]= caña4;
        arreglo[4]= caña5;
        arreglo[5]= resultado;

        int turnoJugador=0;
        List<Jugador> listaJugadores= tablero.getListaJugadores();
        int fichaActual = listaJugadores.get(turnoJugador).getFichaActual();

        switch (resultado) {
            case 0: {
                break;
            }
            case 1: {
                for (int j = 0; j < listaMovimientos.size(); j++) {
                    if ((listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaX() == listaMovimientos.get(j).getX()) && (listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaY() == listaMovimientos.get(j).getY())) {
                        if ((j + resultado) >= 68) {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado - listaMovimientos.size()).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado - listaMovimientos.size()).getY());

                            revisarCasilla(j + resultado - listaMovimientos.size());
                        } else {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado).getY());
                            revisarCasilla(j + resultado);
                        }
                        break;
                    }
                }
                break;
            }

            case 2: {
                for (int j = 0; j < listaMovimientos.size(); j++) {
                    if ((listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaX() == listaMovimientos.get(j).getX()) && (listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaY() == listaMovimientos.get(j).getY())) {
                        if ((j + resultado) >= 68) {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado - listaMovimientos.size()).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado - listaMovimientos.size()).getY());
                            revisarCasilla(j + resultado - listaMovimientos.size());
                        } else {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado).getY());
                            revisarCasilla(j + resultado);
                        }
                        break;
                    }
                }
                break;
            }

            case 3: {
                for (int j = 0; j < listaMovimientos.size(); j++) {
                    if ((listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaX() == listaMovimientos.get(j).getX()) && (listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaY() == listaMovimientos.get(j).getY())) {
                        if ((j + resultado) >= 68) {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado - listaMovimientos.size()).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado - listaMovimientos.size()).getY());
                            revisarCasilla(j + resultado- listaMovimientos.size());
                        } else {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + resultado).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + resultado).getY());
                            revisarCasilla(j + resultado);
                        }
                        break;
                    }
                }
                break;
            }

            case 4: {
                for (int j = 0; j < listaMovimientos.size(); j++) {
                    if ((listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaX() == listaMovimientos.get(j).getX()) && (listaJugadores.get(turnoJugador).getFichas().get(fichaActual).getCoordenadaY() == listaMovimientos.get(j).getY())) {
                        if ((j + 10) >= 68) {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + 10 - listaMovimientos.size()).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + 10 - listaMovimientos.size()).getY());

                            revisarCasilla(j + 10 - listaMovimientos.size());
                        } else {
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaX(listaMovimientos.get(j + 10).getX());
                            listaJugadores.get(turnoJugador).getFichas().get(fichaActual).setCoordenadaY(listaMovimientos.get(j + 10).getY());
                            revisarCasilla(j + 10);
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
        /**
     * Método que verifica si una ficha cayó en una casilla triangular.
     *
     * @param numCasilla número de casilla
     */
    public void revisarCasilla(int numCasilla){
        if((numCasilla)==9 || (numCasilla)==25 || (numCasilla)==42 || (numCasilla)==59){
                            JOptionPane.showMessageDialog(null, "Caíste en una casilla central ocupada!!");
        }
    }
}
