public class Stack<T> {

    private class Node {
        T value;
        Node next;
    }

    private Node top;

    public void push(T value) {
        Node node = new Node();
        node.value = value;
        node.next = top;
        top = node;
    }

    public T pop() throws StackEmptyException{
        if (top == null) {
            throw new StackEmptyException();
        }
        T value = top.value;
        top = top.next;
        return value;
    }

    public static class StackEmptyException extends Exception {}

}
