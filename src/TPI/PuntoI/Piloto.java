package TPI.PuntoI;

public class Piloto extends Persona implements  Volador{

    private String licencia;

    public Piloto(String apellido, String nombre, int edad, String licencia) {
        super(apellido, nombre, edad);
        this.licencia = licencia;
    }


    public String getLicencia() {
        return licencia;
    }

    @Override
    public String getDatos() {
        return super.getDatos() + " Licencia: "+ this.licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public void Volar() {
        System.out.println("Preparando motores");
        System.out.println("Maxima potencia");
        System.out.println("Despegue");
    }
}
