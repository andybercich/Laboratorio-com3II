package TPI.PuntoI;
import java.sql.Time;
import java.util.Date;

public class Reserva {
    private Date fechaReserva;
    private Time hora;

    public Reserva (Date fechaReserva , Time hora){

        this.fechaReserva = fechaReserva;
        this.hora = hora;

    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getDatos(){

        return "Fecha: "+ getFechaReserva()+ " Hora: "+ getHora();

    }

}
