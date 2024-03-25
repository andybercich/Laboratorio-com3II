package TPI.PuntoII;

public class Avion {
    private String marcaAvion;
    private String matricula;
    private int numAsientos;


    public Avion(String marcaAvion, String matricula, int numAsientos) {
        this.marcaAvion = marcaAvion;
        this.matricula = matricula;
        this.numAsientos = numAsientos;

    }



    public String getMarcaAvion() {
        return marcaAvion;
    }

    public void setMarcaAvion(String marcaAvion) {
        this.marcaAvion = marcaAvion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }


    public String getDatos(){
        return "Marca :"+marcaAvion+ "\nMatricula: "+ matricula+ "\nNumero de asientos: "+numAsientos;
    }

}
