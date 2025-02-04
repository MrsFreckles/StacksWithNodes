public class Stack<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public boolean isEmpty() {
        return tail == null;
    }

    public T top() {
        if (tail == null) {
            return null;
        }
        return tail.getContent();
    }

    public void push(T o) {
        Node<T> newNode = new Node<>(o);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        T temp = tail.getContent();
        // Falls es nur ein Element gibt, leeren wir den Stack
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            // Suche den Knoten, der direkt vor dem tail liegt
            Node<T> current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            // Setze den gefundenen Knoten als neuen tail
            tail = current;
            tail.setNext(null);
        }
        return temp;
    }

    public class Node<T> {
        private T content = null;
        private Node<T> next = null;

        public Node(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
