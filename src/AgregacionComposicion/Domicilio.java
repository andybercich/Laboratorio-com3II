package AgregacionComposicion;

public class Domicilio {

    private String nombreCalle;
    private int numCalle;


    public Domicilio(){}
    public Domicilio (String nombreCalle , int numCalle){

        this.nombreCalle = nombreCalle;
        this.numCalle = numCalle;

    }


    public int getNumCalle() {
        return numCalle;
    }
    public String getNombreCalle() {
        return nombreCalle;
    }
    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public String Datos (){

        return "Calle: "+ nombreCalle + " Numero Calle: "+ numCalle;

    }

}
