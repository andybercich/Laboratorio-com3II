package TPI.PuntoI;

import java.util.ArrayList;

public class Flota {

    private String empresa;
    private ArrayList <Avion> aviones = new ArrayList<>();

    public Flota( String empresa, Avion avion){

        this.empresa = empresa;
        this.aviones.add(avion);
    }


    public void AgregarAvion (Avion a){

        this.aviones.add(a);

    }

    public void MostrarAviones(){

        for (int i = 0; i<aviones.size();i++){

            System.out.println("Avion "+ (i+1) +": ");
            System.out.println( aviones.get(i).getDatos());

        }

    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getEmpresa() {
        return empresa;
    }
}
