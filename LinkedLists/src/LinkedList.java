import java.util.Iterator;

public class LinkedList<T>{


    private class Node {
        T value;
        Node next;
    }

    private Node head = new Node();
    private Node tail = head;
    private int size = 0;


    public void insert(T value) {
        Node newNode = new Node();
        newNode.value = value;
        size += 1;
        tail.next = newNode;
        tail = newNode;
    }
    // insert without tail
    public void insert(T value) {
        Node previous = head;
        Node current = head.next;
        while(current != null) {
            previous = current;
            current = current.next;

        }
        Node newNode = new Node();
        newNode.value = value;
        previous.next = newNode;
        size += 1;
    }

    public int getSize() {
        return size;
    }

    public boolean find(T value) {
        Node current = head.next;
        while(current != null) {
             if (current.value == value) return true;
             current = current.next;
        }
        return false;
    }

    public boolean findRecursive(T value) {
        return findRecursive(value, head.next);
    }

    private boolean findRecursive(T value, Node current) {
        if (current == null) return false;
        if (current.value == value) return true;
        return findRecursive(value, current.next);
    }

    public int remove(T value) {
        Node previous = head;
        Node current = head.next;
        int found = 0;
        while(current != null) {
            if (current.value == value) {
                previous.next = current.next;
                size -= 1;
                found++;
                // only needed if using tail reference
                if (current == tail) {
                    tail = previous;
                }
            }
            previous = current;
            current = current.next;
        }
        return found;
    }

    public void display() {
        Node current = head.next;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void forEach(ForEachHandler<T> handler) {
        Node current = head.next;
        while(current != null) {
            if(!handler.callback(current.value)) {
                break;
            }
            current = current.next;
        }
    }

    public interface ForEachHandler<T> {
        boolean callback(T t);
    }

}
