package PilaStack;

/** Clase principa que implementa los metodos de la clase pila.  */
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(65);

        System.out.println("<<-- Pila -->>");
        pila.listar();
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());

        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
        pila.editar(12, 44);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
        pila.remover(16);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
        System.out.println(pila.buscar(65));

        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());

        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }
}