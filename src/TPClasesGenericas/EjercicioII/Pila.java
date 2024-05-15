package TPClasesGenericas.EjercicioII;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila <E>{

    private int maximo;
    private int posicion = 0;
    private ArrayList<E> elementos;

    public Pila(int maximo) throws Exception {
        if (maximo<0){
            throw new Exception("No se puede crear una pila con 0 o menos elementos");
        }
        this.maximo = maximo;
        elementos = new ArrayList<>();

    }

    public boolean isEmpty(){
        return posicion == 0;
    }

    public boolean agregarElemento(E e) throws Exception {

        if (maximo > posicion && maximo != posicion){

            elementos.add(posicion, e);
            posicion++;
            return true;

        }else {
            return false;

        }

    }

    public E primero(){

        if (isEmpty()){
            throw new EmptyStackException();
        }else {

            return elementos.get(posicion-1);

        }

    }

    public E extraer(){

        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            E elemento = elementos.get(posicion-1);
            elementos.remove(posicion-1);
            posicion--;
            return elemento;


        }

    }



}
