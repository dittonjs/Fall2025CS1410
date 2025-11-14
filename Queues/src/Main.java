public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("I");
        queue.enqueue("Am");
        queue.enqueue("In");
        queue.enqueue("A");
        queue.enqueue("Queue");

        Stack<String> stack = new Stack<>();
        stack.

        while(!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (Queue.QueueEmptyException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
