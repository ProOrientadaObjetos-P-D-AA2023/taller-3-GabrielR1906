package Ejecutor;

public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    
    public double ObtenerMinutos(){
        minutos = 60 * horas;
        return minutos;
    }
    public double ObtenerSegundos(){
        segundos = 3600 * horas;
        return segundos;
    }
    public double ObtenerDias() {
        dias = horas / 24;
        return dias;
    }
}
