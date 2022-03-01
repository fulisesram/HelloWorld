package PilaStack;
/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 */
public class Nodo {

    private int valor; // Variable en la cual se va a guardar el valor.
    private Nodo siguiente; // Variable para enlazar los nodos.


    /** Constructor que inicializamos el valor de las variables. */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    /** Métodos get y set para los atributos.*/
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

//LIFO (last-in / first-out)
//FILO (first-in / last-out)
/**
 * push -> introducir datos
 * pop -> quitar el ultimo dato de la pila
 * peek -> cual es el ultimo dato que se introdujo en la pila
 * empty -> validar si la pila tiene datos
 * */