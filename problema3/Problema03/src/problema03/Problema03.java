package problema03;
import java.util.Scanner;
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        InstitucionesEducativas i = new InstitucionesEducativas();
        
        boolean bandera = true;
        String nombre;
        String tipo;
        int numeroAlumnos;
        int numeroDocentes;
        int numeroSedes;
        double gastos;
        String opcion;
        
        while (bandera) {
            System.out.println("Ingrese el nombre de la institucion:");
            nombre = entrada.nextLine();
            i.setNombre(nombre);
            
            System.out.println("Ingrese el tipo de institucion:");
            tipo = entrada.nextLine();
            i.setTipo(tipo);
            
            System.out.println("Ingrese el numero de alumnos:");
            numeroAlumnos = entrada.nextInt();
            i.setNumeroAlumnos(numeroAlumnos);
            
            System.out.println("Ingrese el numero de docentes:");
            numeroDocentes = entrada.nextInt();
            i.setNumeroDocentes(numeroDocentes);
            
            System.out.println("Ingrese el numero de sedes:");
            numeroSedes = entrada.nextInt();
            i.setNumeroSedes(numeroSedes);
            
            System.out.println("Ingrese los gastos proyectados por "
                    + "estudiante:");
            gastos=entrada.nextDouble();
            i.setGastosEstudiante(gastos);
            
            System.out.println("\nNombre de la insitucion: " + i.getNombre());
            System.out.println("Tipo de insitucion: " + i.getTipo());
            System.out.println("Numero de alumnos: " + i.getNumeroAlumnos());
            System.out.println("Numero de docentes: " + i.getNumeroDocentes());
            System.out.println("Numero de sedes: " + i.getNumeroSedes());
            System.out.println("Gastos proyectados por estudiante: " +
                    i.getGastosEstudiante());
            System.out.println("Presupuesto: " + i.ObtenerPresupuesto());
            
            System.out.println("\nDesea continuar?\nescriba si para "
                    + "continuar y no para salir");
            entrada.nextLine();
            opcion = entrada.nextLine();
            if (opcion.equals("no")) {
                bandera = false;
            }
        }
    }

}
