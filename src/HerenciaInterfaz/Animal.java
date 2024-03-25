package HerenciaInterfaz;

public abstract class Animal {

    protected String raza;
    protected int edad;

    public Animal (String raza, int edad){

        this.raza = raza;
        this.raza = raza;

    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



    abstract void Comer();

}
