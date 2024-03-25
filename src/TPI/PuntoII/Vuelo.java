package TPI.PuntoII;

public class Vuelo {

    private int idVuelo;
    private Avion avionVuelo;
    private Reserva[] reservaVuelo;

    public Vuelo() {
    }

    public Vuelo(int idVuelo, Avion avionVuelo) {
        this.idVuelo = idVuelo;
        this.avionVuelo = avionVuelo;
        reservaVuelo = new Reserva[avionVuelo.getNumAsientos()];
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getDatos(){
        return "ID del vuelo: "+ idVuelo+"\navion: "+avionVuelo.getDatos();
    }

    public Avion getAvionVuelo() {
        return avionVuelo;
    }

    public void setAvionVuelo(Avion avionVuelo) {
        this.avionVuelo = avionVuelo;
        this.reservaVuelo = new Reserva[avionVuelo.getNumAsientos()];
    }

    public void agregarReserva(Reserva reservaVuelo){
        for(int i = 0;i < this.reservaVuelo.length;i++){
            if (this.reservaVuelo[i] != null){
                this.reservaVuelo[i] = reservaVuelo;
                break;
            }
        }
    }

}
