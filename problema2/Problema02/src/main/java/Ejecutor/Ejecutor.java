
package Ejecutor;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       EquivalenteHora h = new EquivalenteHora();
      
       double horas;
       System.out.println("Ingresa las horas:");
       horas = entrada.nextDouble();
       h.setHoras(horas);
       
       System.out.println("Cantidad de horas: " + horas);
       System.out.println("Equivalente en minutos: " + h.ObtenerMinutos()
               + " minutos");
       System.out.println("Equivalente en segundos: " + h.ObtenerSegundos()
               + " segundos");
       System.out.println("Eequivalente en dias: " + h.ObtenerDias()+ " dias");
    }
    
}
