public class Queue<T> {
    private class Node {
        T value;
        Node next;
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public T dequeue() throws QueueEmptyException{
        if (head == null) {
            throw new QueueEmptyException();
        }

        T value = head.value;
        head = head.next;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public static class QueueEmptyException extends Exception {}
}
