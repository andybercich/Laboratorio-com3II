package TPI.PuntoI;

import java.util.ArrayList;

public class Avion {

    private int capacidadCombustible;
    private String matricula;
    private int numeroAsientos;
    private ArrayList <Vuelo> vuelos = new ArrayList<>();

    public Avion (int capacidadCombustible, String matricula, int numeroAsientos){

        this.capacidadCombustible = capacidadCombustible;
        this.matricula = matricula;
        this.numeroAsientos = numeroAsientos;


    }

    public void AgregarVuelo(Vuelo v){
        this.vuelos.add(v);

    }
    public void MostrarVuelos(){
        for (int i = 0; i<vuelos.size();i++){

            System.out.println("Vuelo "+ (i+1));
            System.out.println(vuelos.get(i).getDatos());

        }
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDatos (){

        return "Matricula: "+ getMatricula() + " Numero Asientos: "+ getNumeroAsientos() + " Capacidad Combustible: "+ getCapacidadCombustible() ;

    }

}
