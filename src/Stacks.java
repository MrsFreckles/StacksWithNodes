public class Stacks<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public T front() {
        if (head == null) {
            return null;
        }
        return head.getContent();
    }

    public void enqueue(T o) {
        Node<T> newNode = new Node<>(o);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T temp = head.getContent();
        head = head.getNext();
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