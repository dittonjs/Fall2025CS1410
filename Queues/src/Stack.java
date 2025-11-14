import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> values = new ArrayList<>();

    public void push(T value) {
        values.addFirst(value);
    }

    public T pop() {
        return values.removeFirst();
    }
}
