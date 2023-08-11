public interface QueueADT<E> extends Iterable {
    void enQueue(E element);
    E deQueue();
    E peek();
    int size();
    boolean isFull();
    boolean isEmpty();
}
