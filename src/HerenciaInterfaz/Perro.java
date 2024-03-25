package HerenciaInterfaz;

public class Perro extends Animal{

    private String pelaje;

    public Perro(String raza, int edad, String pelaje) {
        super(raza, edad);
        this.pelaje = pelaje;
    }

    @Override
    void Comer() {
        System.out.println("Esta comiendoooo carneeee");
    }
}
