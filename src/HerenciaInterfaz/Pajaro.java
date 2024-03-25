package HerenciaInterfaz;

public class Pajaro extends  Animal implements Volador{

    private String plumaje;

    public Pajaro(String raza, int edad, String plumaje) {
        super(raza, edad);
        this.plumaje = plumaje;

    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    @Override
    void Comer() {
        System.out.println("Estoy comiendooo semilaaas");
    }

    @Override
    public void Volar() {
        System.out.println("Yo vuelo con mis alas");
    }
}
