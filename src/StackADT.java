public interface StackADT<E> extends Iterable {
    void push(E element);
    E pop();
    E peek();            // Le Thang
    int size();
    boolean isFull();
    boolean isEmpty();
}
