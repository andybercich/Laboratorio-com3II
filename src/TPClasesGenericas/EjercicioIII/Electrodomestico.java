package TPClasesGenericas.EjercicioIII;

public class Electrodomestico extends Producto {

    private double wats;

    public Electrodomestico(String nombre, double precio, double wats) {
        super(nombre, precio);

        this.wats = wats;
    }

    public double getWatts() {
        return wats;
    }

    public void setWatts(double watts) {
        this.wats = watts;
    }
    public String toString(){

        return super.toString()+ "         Wats: "+ this.getWatts();

    }
}
