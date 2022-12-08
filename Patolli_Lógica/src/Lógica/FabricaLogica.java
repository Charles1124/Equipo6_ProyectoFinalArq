/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

/**
 *
 * @author cyt88
 */
public class FabricaLogica {
    private static ILogica logica; 

    public static ILogica crearLogica(){
         if(logica==null){
             logica= new FachadaLogica();
         }
         return logica;
    }
}
