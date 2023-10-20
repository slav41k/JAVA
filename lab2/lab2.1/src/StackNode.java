public class StackNode<T> {
    private final T data;
    protected StackNode<T> next;

    public StackNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public StackNode<T> getNext() {
        return next;
    }
}
