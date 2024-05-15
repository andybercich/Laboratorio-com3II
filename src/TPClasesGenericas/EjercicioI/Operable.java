package TPClasesGenericas.EjercicioI;

public interface Operable<E extends Number, B extends Number> {


    public default E sumar(E e, B b) {

        return(E)(Number)(e.doubleValue()+b.doubleValue());

    };

    public default E restar(E e, B b) {

        return(E)(Number)(e.doubleValue()-b.doubleValue());

    };

    public default E multiplicar(E e, B b) {

        return(E)(Number)(e.doubleValue()*b.doubleValue());

    };

    public default E dividir(E e, B b) {
        if (b.doubleValue() == 0){

            throw new ArithmeticException();

        }else {

            return(E)(Number)(e.doubleValue()+b.doubleValue());

        }


    };


}
