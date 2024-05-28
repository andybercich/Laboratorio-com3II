package TpDebug;

import java.util.Map;
import java.util.HashMap;
public class GestionEstudiantes {
    public static void main(String[] args) {
        Map<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Ana", 85);
        estudiantes.put("Juan", 90);
        estudiantes.put("Maria", 75);
        estudiantes.put("Pedro", 60);

        System.out.println("Nota media: " + calcularNotaMedia(estudiantes));
    }
    public static double calcularNotaMedia(Map<String, Integer> estudiantes) {
        //double suma = 0;
        int suma = 0;
        for (String nombre : estudiantes.keySet()) {
            suma += estudiantes.get(nombre);
        }

        return suma / estudiantes.size(); // Error semántico: División entera, esto se arregla cambiando el tipo de
        // dato suma de int a double
    }
}
