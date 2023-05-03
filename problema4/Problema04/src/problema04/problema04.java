package problema04;

import java.util.Scanner;

public class problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        EquipoCelular e = new EquipoCelular();

        String sistemaOperativo;
        String tamanoPantalla;
        double costoInicial;
        Double ivaporcentaje;
        String mac;
        String imei;
        boolean bandera = true;
        String opcion;

        while (bandera) {
            System.out.println("Ingrese el sistema operativo del equipo:");
            sistemaOperativo = entrada.nextLine();
            e.setSistemaOperativo(sistemaOperativo);

            System.out.println("Ingrese el tamaño de la pantalla del equipo:");
            tamanoPantalla = entrada.nextLine();
            e.setTamanoPantalla(tamanoPantalla);

            System.out.println("Ingrese el costo inicial:");
            costoInicial = entrada.nextDouble();
            e.setCostoInicial(costoInicial);

            System.out.println("Ingrese el IVA en porcentaje:");
            ivaporcentaje = entrada.nextDouble();
            e.setIvaCostoInicial(ivaporcentaje);

            System.out.println("Ingrese la direccion MAC del equipo:");
            entrada.nextLine();
            mac = entrada.nextLine();
            e.setDireccionMac(mac);

            System.out.println("Ingrese la informacion IMEI del equipo:");
            imei = entrada.nextLine();
            e.setImei(imei);

            System.out.println("\nInformacion del equipo:");
            System.out.println("Sistema Operativo: " + e.getSistemaOperativo());
            System.out.println("Tamaño de Pantalla: " + e.getTamanoPantalla());
            System.out.println("Costo Inicial: " + e.getCostoInicial() + "$");
            System.out.println("Porcentaje de IVA: " + e.getIvaCostoInicial()
                    + "%");
            System.out.println("La direccion MAC es: " + e.getDireccionMac());
            System.out.println("Informacion IMEI: " + e.getImei());
            System.out.println("Costo Final: " + e.ObtenerCostoFinal() + "$");

            System.out.println("Desea continuar con otro equipo?\nIngrese si "
                    + "para continuar y no para salir:");
            opcion = entrada.nextLine();
            opcion = opcion.toLowerCase();
            if (opcion.equals("no")) {
                bandera = false;
            }
        }

    }

}
