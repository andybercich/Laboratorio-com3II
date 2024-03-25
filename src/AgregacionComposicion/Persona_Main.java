package AgregacionComposicion;


public class Persona_Main {

    public static void main (String [] args){

            Persona o = new Persona("Andy", 19, 49, "Rio");
            Curso c = new Curso("Estadística");
            c.setNombre("Ingles");
            o.AgregarCurso(c);

            o.setDomicilio("JACAYENA", 450);
            System.out.println(o.MostrarDatos());


    }

}
