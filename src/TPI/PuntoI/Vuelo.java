package TPI.PuntoI;

public class Vuelo {

    private Avion avionVuelo;
    private int cantidadPasajeros;
    private String origen;
    private String destino;
    private Reserva [] reservas;

    public Vuelo (Avion avionVuelo, String origen, String destino ){
        Reserva [] reservas1 = new Reserva[avionVuelo.getNumeroAsientos()];
        this.avionVuelo = avionVuelo;
        this.origen = origen;
        this.destino = destino;
        this.reservas = reservas1;
        this.cantidadPasajeros = avionVuelo.getNumeroAsientos();


    }

    public String getAvionVuelo() {
        return avionVuelo.getDatos();
    }

    public int getCantidadPasajeros() {

        return cantidadPasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDatos(){

        return "Origen: "+ getOrigen() + " Destino: "+ getDestino() + " Cantidad Pasajeros: "+ getCantidadPasajeros() + " Para obtener datos de las reservas del vuelo, use getReservas:";

    }

    public void getReservas() {
        int longitud = this.reservas.length;

        for (int i = 0; i <longitud ; i++){
            if (reservas[i] !=null) {
                System.out.println("Reserva " + (i + 1) + ": ");
                System.out.println(this.reservas[i].getDatos());
            }else {

                break;

            }
        }

    }
    public void AgregarReservas(Reserva r){
        int num = 0;
        for (int i = 0; i<reservas.length;i++){

            if (reservas[i] == null){
                reservas[i] = r;
                break;
            }else {
                num+=1;
            }

        }
        if(num == cantidadPasajeros){

            System.out.println("Las reservas estan llenas");

        }


    }

    public void setAvionVuelo(Avion avionVuelo) {
        this.avionVuelo = avionVuelo;
        this.reservas = new Reserva[avionVuelo.getNumeroAsientos()];
        this.cantidadPasajeros = avionVuelo.getNumeroAsientos();
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

}
