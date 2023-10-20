import java.util.EmptyStackException;
import java.util.function.Consumer;

public class Stack<T> {
    private StackNode<T> top;

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear() {
        top = null;
    }

    public void forEach(Consumer<T> action) {
        StackNode<T> current = top;
        while (current != null) {
            action.accept(current.getData());
            current = current.getNext();
        }
    }
}