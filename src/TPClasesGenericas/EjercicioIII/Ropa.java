package TPClasesGenericas.EjercicioIII;

public class Ropa extends Producto{

    private Talle talle;

    public Ropa(String nombre, double precio, Talle talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    public Talle getTalle() {
        return talle;
    }

    public String toString(){
        return super.toString() + "         Talle: "+ talle.getDescripcion();
    }

}
