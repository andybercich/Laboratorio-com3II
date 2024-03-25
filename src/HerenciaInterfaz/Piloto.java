package HerenciaInterfaz;

public class Piloto implements Volador {

    public Piloto (){

    }


    @Override
    public void Volar() {
        System.out.println("Yo vuelo con mi avión");
    }
}
