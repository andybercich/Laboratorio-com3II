package TPI.PuntoII;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Qatar Airways","Q2R23T",150);
        Vuelo v1 = new Vuelo(1, a1);
        Reserva r1 = new Reserva(LocalDate.of(2024,03,21),98,v1);

        v1.agregarReserva(r1);
        System.out.println(v1.getDatos());
        System.out.println(r1.getDatos());
    }
}