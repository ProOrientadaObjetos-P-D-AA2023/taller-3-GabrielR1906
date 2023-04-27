/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import java.util.Scanner;
import terreno.terreno;

/**
 *
 * @author renat
 */
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objetos
        Scanner entrada = new Scanner(System.in);
        terreno t = new terreno();
        
        //Datos 
        System.out.println("Ingrese el ancho del terreno: ");
        double anchoT = entrada.nextDouble();
        t.setAncho(anchoT);
        
        System.out.println("Ingrese el largo del terreno: ");
        double largoT = entrada.nextDouble();
        t.setLargo(largoT);
               
        System.out.println("Ingrese el valor del metro cuadrado: ");
        double metroCuadrado = entrada.nextDouble();
        t.setValorMetroCuadrado(metroCuadrado);
        
        //Presentar
        System.out.println("El ancho del terreno es: " + t.getAncho());
        System.out.println("El largo del terreno es: " + t.getLargo());
        System.out.println("El area del terreno es: " + t.obtenerArea());
        System.out.println("El valor del metro cuadrado es: "
                + t.getValorMetroCuadrado());
        System.out.println("El costo total del terreno es de: "
                + t.costo_terreno());
    }
    
}
