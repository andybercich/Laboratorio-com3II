package HerenciaInterfaz;

public class AnimalesMain {
    public static void main(String[] args) {
        Perro p = new Perro("Chow Chow", 5, "Roludo");
        Pajaro oajaro = new Pajaro("Siete Cuchillos", 2, "Amarillo");
        oajaro.Volar();
        p.Comer();
        oajaro.Comer();

    }
}
