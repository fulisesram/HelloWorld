package queue;

import java.lang.reflect.Array;
import java.util.Iterator;

   public class Queue<ELEMENT> implements Iterable<ELEMENT> {

       protected final static Integer defaulDimension = 10;

        protected Class<?> elementClass;
        protected ELEMENT [] data;
        protected int head;
        protected int tail;
        protected int count;

        //region Constructors
        public Queue() {
            this(Queue.defaulDimension);
        }

        // from https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
        @SuppressWarnings("unchecked")
        public Queue(int dimension, ELEMENT... dummy) {
            if (dummy.length > 0) {
                throw new IllegalArgumentException("No se debe facilitar valores para dummy");
            }
            elementClass = dummy.getClass().getComponentType();
            this.data = (ELEMENT []) Array.newInstance(this.elementClass, dimension);
            this.head = 0;
            this.tail = 0;
            this.count = 0;
        }

        //Queue Internal Methods
        protected int next(int pos) {
            if (++pos >= this.data.length) {
                pos = 0;
            }
            return pos;
        }

        //Metodo add -> regresa una excepcion cuando se llega al maximo
        public boolean add(ELEMENT element) {

            if (this.size() >= this.data.length) {
                throw new IllegalStateException("Cola llena ...");
            }
            this.data[this.tail] = element;
            this.tail = this.next(this.tail);
            ++this.count;

            return true;
        }

        //Metodo offer -> regresa un boolean cuando se llega al maximo
       public boolean offer(ELEMENT element) {

           if (this.size() >= this.data.length) {
               return false;
           }
           this.data[this.tail] = element;
           this.tail = this.next(this.tail);
           ++this.count;

           return true;
       }

        // Operacion peek
        public ELEMENT element() {

            if (this.size() <= 0) {
                throw new IllegalStateException("Cola vacía ...");
            }
            return this.data[this.head];
        }

        // Retrieves, but does not remove, the head of this queue, or returns null if
        // this queue is empty.
        public ELEMENT peek() {
            if (this.size() <= 0) {
                return null;
            }

            return this.data[this.head];
        }


        // Operacion DeQueue / pool
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        public ELEMENT pool() {
            if (this.size() <= 0) {
                return null;
            }

            ELEMENT result = this.data[this.head];
            this.head = this.next(this.head);
            --this.count;

            return result;
        }

        // Operacion DeQueue / remove
        // Retrieves and removes the head of this queue. This method differs from poll()
        // only in that it throws an exception if this queue is empty.
        public ELEMENT remove() {
            if (this.size() <= 0) {
                throw new IllegalStateException("Cola vacía ...");
            }

            ELEMENT result = this.data[this.head];
            this.head = this.next(this.head);
            --this.count;

            return result;
        }

        //region Override Object basic methods
        @Override
        public String toString() {

            if (this.size() <=0) {
                return "";
            }

            // from https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/StringBuilder.html
            StringBuilder sb = new StringBuilder();
            sb.append("[" + this.data[this.head].toString());

            for (int cta = 1, pos = this.next(this.head); cta < this.size(); ++cta, pos = this.next(pos)) {
                sb.append(", " + this.data[pos].toString());
            }

            sb.append("]");
            return sb.toString();
        }

        //region Collection Methods
        public boolean isEmpty() {
            return this.count <= 0;
        }

        public int size() {
            return this.count;
        }

        public ELEMENT[] toArray() {
            if (this.size() <= 0) {
                throw new IllegalStateException("Cola vacía ...");
            }

//        ELEMENT [] result = (ELEMENT []) new Object[this.size()];
            ELEMENT [] result = (ELEMENT []) Array.newInstance(this.elementClass, this.size());
            for(int i = 0, pos = this.head, cta = this.size(); cta > 0; ++i, pos = this.next(pos), --cta) {
                result[i] = this.data[pos];
            }
            return result;
        }


        //region Caso Ejemplo b) Methods

        public Queue<ELEMENT> union(Queue<ELEMENT> queue2) {
            return union(queue2, 0);
        }

        public Queue<ELEMENT> union(Queue<ELEMENT> queue2, int moreElements) {
            Queue<ELEMENT> queue1 = this;

            Queue<ELEMENT> result = new Queue<ELEMENT>(queue1.size() + queue2.size() + moreElements);

            for(int pos = queue1.head, cta = queue1.size(); cta > 0; pos = queue1.next(pos), --cta) {
                result.offer( queue1.data[pos] );
            }
            for(int pos = queue2.head, cta = queue2.size(); cta > 0; pos = queue2.next(pos), --cta) {
                result.offer( queue2.data[pos] );
            }

            return result;

        }


        //region Iterable Methods
        @Override
        public Iterator<ELEMENT> iterator() {
            return new QueueIterator(this);
        }

        private class QueueIterator implements Iterator<ELEMENT> {

            private Queue<ELEMENT> itQueue;
            private int itCount;
            private int itPos;

            public QueueIterator(Queue<ELEMENT> queue) {
                this.itQueue = queue;
                this.itCount = this.itQueue.size();
                this.itPos = this.itQueue.head;
            }

            @Override
            public boolean hasNext() {
                return this.itCount > 0;
            }

            @Override
            public ELEMENT next() {
                if ( !this.hasNext() ) {
                    throw new RuntimeException("Error en el iterador de la cola...");
                }
                ELEMENT item = this.itQueue.data[this.itPos];
                this.itPos = this.itQueue.next(this.itPos);
                --this.itCount;
                return item;
            }
        }

    }