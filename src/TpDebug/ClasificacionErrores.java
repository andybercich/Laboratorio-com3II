package TpDebug;

public class ClasificacionErrores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("El tercer elemento es: " + numeros[3]);
        String mensaje = null;
        //System.out.println(mensaje.length()); // Error lógico: ya que se trata de usar un método con una variable de
        // tipo null

        for(int i = 0; i <= numeros.length; i++) {
            //System.out.println("Número: " + numeros[i]);// Error de ejecución: ya que se trata de acceder a un
            // espacio del array que no existe
        }

        //int resultado = dividir(10, 0);  // Error de ejecucion: division por cero
        //System.out.println("Resultado de la división: " + resultado); Error de ejecución

        System.out.println(saludo("Juan"));
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static String saludo(String nombre) {
        return "Hola, " + nombre;
    }
}
