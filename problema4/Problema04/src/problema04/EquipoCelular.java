package problema04;

import java.util.Scanner;

public class EquipoCelular {

    Scanner entrada = new Scanner(System.in);

  
    private String sistemaOperativo;
    private String tamanoPantalla;
    private double costoInicial;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    private double iva;

    
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public void setIvaCostoInicial(double ivaCostoInicial) {
        this.ivaCostoInicial = ivaCostoInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String IMEI) {
        this.imei = IMEI;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    
    public double ObtenerCostoFinal(){
        iva = (ivaCostoInicial / 100) * costoInicial;
        costoFinal = costoInicial + iva;
        return costoFinal;
    }
}