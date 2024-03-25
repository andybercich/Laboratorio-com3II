package TPI.PuntoI;

import java.sql.Time;
import java.util.Date;

public class mainPuntoI {
    public static void main(String[] args) {
        Avion a = new Avion(55000,"LBD 458",1);
        Flota f = new Flota("Fly Bondi", a);
        Vuelo v = new Vuelo(a, "Buenos Aires - Argentina", "Sao Pablo - Brasil");
        a.MostrarVuelos();
        f.MostrarAviones();

        Reserva r = new Reserva(new Date(2024,3,20),new Time(10, 50, 55));
        Reserva r2 = new Reserva(new Date(2024,2,22), new Time(12,22,33));
        v.AgregarReservas(r);
        v.AgregarReservas(r2);
        v.getReservas();


    }
}
