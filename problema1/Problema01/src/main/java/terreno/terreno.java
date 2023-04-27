/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terreno;

/**
 *
 * @author renat
 */
public class terreno {
    
    //Atributos
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public double getCosto_terreno() {
        return costo_terreno;
    }

    public void setCosto_terreno(double costo_terreno) {
        this.costo_terreno = costo_terreno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    //Metodos
    public double obtenerArea(){
        area = largo * ancho;
        return area;
    }
    
    public double costo_terreno(){
        costo_terreno = area * valorMetroCuadrado;
        return costo_terreno;
    }
}
