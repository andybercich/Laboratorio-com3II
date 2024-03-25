package TPI.PuntoI;

public class Persona {
    private String apellido;
    private String nombre;
    private int edad;

    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDatos (){
        return "Nombre: "+ this.nombre + " Apellido: "+ this.apellido + " Edad: "+ this.edad;
    }

}
