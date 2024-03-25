package TPI.PuntoII;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fecha;
    private int numAsientos;
    private Vuelo b;

    public Reserva(LocalDate fecha, int numAsientos,Vuelo vuelo) {
        this.fecha = fecha;
        this.numAsientos = numAsientos;
        this.b = vuelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    public String getDatos(){
        return "\nFecha: "+getFecha()+"\nNumero de asiento: "+getNumAsientos()+"\nDato vuelo: "+b.getDatos();
    }


}
