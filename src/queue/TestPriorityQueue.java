package queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {

        public static void main(String[] args) {
            PriorityQueue<Integer> cola1 = new PriorityQueue<>();
            cola1.add(70);
            cola1.add(120);
            cola1.add(6);
            System.out.println("Imprimimos la cola con prioridades de enteros");
            while (!cola1.isEmpty())
                System.out.print(cola1.poll() + "-");
        }

    }
/*PriorityQueue
para ordenar la cola de mayor a menor
 */