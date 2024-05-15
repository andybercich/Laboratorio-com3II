package TPClasesGenericas.EjercicioIII;

import TPClasesGenericas.EjercicioII.Pila;

import java.util.concurrent.Callable;

public class mainAlmacen {
    public static void main(String[] args) throws Exception {

        Almacen a = new Almacen();

        Electrodomestico e = new Electrodomestico("Heladera", 45500.12, 45.00);

        Ropa r = new Ropa("Remera Gucci", 555.12, Talle.M);

        Comida c = new Comida("Rosquilla", 12.1, 1500);

        a.agregarProducto(e);
        a.agregarProducto(r);
        a.agregarProducto(c);
        a.mostrarProductos();




    }
}
