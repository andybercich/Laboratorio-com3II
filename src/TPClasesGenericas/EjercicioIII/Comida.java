package TPClasesGenericas.EjercicioIII;

public class Comida extends Producto{

    private double calorias;
    public Comida(String nombre, double precio, double calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCalorias() {
        return calorias;
    }

    public String toString (){
        return super.toString() + "         Calorias: "+ calorias;
    }

}
