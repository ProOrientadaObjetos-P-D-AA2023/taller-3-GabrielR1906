
package problema03;
public class InstitucionesEducativas {
    
    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public double getGastosEstudiante() {
        return gastosEstudiante;
    }

    public void setGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }


     
    public double ObtenerPresupuesto(){
        presupuesto = gastosEstudiante * numeroAlumnos;
        return presupuesto;
        
    }

}
