package TPClasesGenericas.EjercicioIII;

import java.util.ArrayList;

public class Almacen  {

    private ArrayList<Producto> productos;

    public Almacen(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        System.out.println("Se agrego el producto correctamente");
        productos.add(p);
    }

    public void mostrarProductos(){

        for (Producto p:productos){

            System.out.println("Producto "+ (productos.indexOf(p)+1)+ ":  "+ p.toString());

        }

    }



}
