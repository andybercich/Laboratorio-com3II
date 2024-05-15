package TPClasesGenericas.EjercicioIII;

public enum Talle {
    M("Mediano"),
    L("Grande"),
    XL("Extra grande");

    private final String descripcion;

    private Talle(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
