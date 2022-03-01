package queue;

import java.util.LinkedList;
import java.util.Queue;

    public class PruebaQueue {

        public static void main(String[] args) {
            Queue<String> cola1 = new LinkedList<>();

            System.out.println("Insertamos tres elementos en la cola: Fabian, Anais y Melissa");
            cola1.add("Fabian");
            cola1.add("Anais");
            cola1.add("Melissa");

            System.out.println("Elementos en la cola: " + cola1.size());
            System.out.println("Extraemos un elemento: " + cola1.poll());
            System.out.println("Primer elemento de la cola sin extraerlo: " + cola1.peek());
            System.out.println("Elementos en la cola: " + cola1.size());
            System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía: ");

            while (!cola1.isEmpty())
                System.out.print(cola1.poll() + "-");
            System.out.println();

            Queue<Integer> cola2 = new LinkedList<>();
            cola2.add(70);
            cola2.add(120);
            cola2.add(6);
            System.out.println("Imprimimos la cola de enteros");
            for (Integer elemento : cola2)
                System.out.print(elemento + "-");
            System.out.println();
            System.out.println("Borramos toda la cola");
            cola2.clear();
            System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());
        }

    }