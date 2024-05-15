package TPClasesGenericas.EjerciciIV;
import TPClasesGenericas.EjercicioIII.Producto;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> elementos;

    public Almacen() {
        elementos = new ArrayList<>();
    }


    public void agregarElemento(Producto elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        System.out.println("Elementos en el almacén:");
        for (Object elemento : elementos) {
            if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
            } else {
                System.out.println(elemento.toString());
            }
        }
    }
}