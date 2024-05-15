package TPClasesGenericas.EjercicioII;

public class MainPila {
    public static void main(String[] args) throws Exception {

        Pila<Integer> numeros = new Pila<>(5);

        System.out.println(numeros.agregarElemento(5));
        System.out.println(numeros.primero());
        System.out.println(numeros.agregarElemento(8));
        System.out.println(numeros.primero());
        System.out.println(numeros.agregarElemento(7));
        System.out.println(numeros.primero());
        System.out.println(numeros.agregarElemento(15));
        System.out.println(numeros.agregarElemento(25));
        System.out.println(numeros.primero());
        numeros.extraer();
        System.out.println(numeros.primero());
        System.out.println(numeros.agregarElemento(12));
        System.out.println(numeros.primero());


    }
}
