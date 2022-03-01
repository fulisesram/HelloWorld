package tuple;


import java.util.Objects;
import java.util.function.Function;

public class Tuple <T1,T2> {

    public final T1 t1;
    public final T2 t2;

    //constructor tupla con 2 parametros
    private Tuple(T1 t1,T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public static <T1, T2> Tuple<T1, T2> of(T1 t1, T2 t2){
        Objects.requireNonNull(t1);
        Objects.requireNonNull(t2);
        return new Tuple<>(t1, t2);
    }

    Tuple<String, String> stringTuple = Tuple.of("Jon", "Snow");

    //Arity -> means numbers of arguments to the tuple.
    public int arity() {
        return 2;
    }
    /*
    Aplique la función a T1 que produce el resultado R y
    devuelve una nueva Tuple2<R, T2>.
    */
    public <R> Tuple<R, T2> apply_1(Function<T1, R> function) {
        Objects.requireNonNull(function);
        return Tuple.of(function.apply(t1), t2);
    }
    /*
    Aplique la función a T2 que produce el resultado R y
    devuelve una nueva Tuple2<T1, R>.
    */
    public <R> Tuple<T1, R> apply_2(Function<T2, R> function) {
        Objects.requireNonNull(function);
        return Tuple.of(t1, function.apply(t2));
    }

    /*
    Este método acepta dos funciones diferentes.
    Aplique la primera función a T1 que produce el resultado R1 y
    aplique la segunda función a T2 que produce el resultado R2 y
    devuelva una nueva Tuple<R1, R2>.
    */
    public <R1, R2> Tuple<R1, R2>
    apply(Function<T1, R1> function1, Function<T2, R2> function2) {
        Objects.requireNonNull(function1);
        Objects.requireNonNull(function2);
        return Tuple.of(function1.apply(t1), function2.apply(t2));
    }


    Tuple<String, String> tuple = Tuple.of("Jon", "Snow");
    Tuple<Integer, Integer> intIntTuple =
            tuple.apply((str) -> str.length(), (str) -> str.length());

}
