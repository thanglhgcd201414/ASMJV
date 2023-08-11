import java.util.Iterator;
public class Stack<E> implements StackADT<E> {
    private static final int DEFAULT_CAPACITY=10;
    private E[] stack;
    private int top;        // Le Thang
    Stack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }
    @Override
    public void push(E element) {
        if (isFull())  throw new IllegalStateException("Stack Overflow!!");
        stack[++top] = element;
    }
    @Override
    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is Empty!!");
        return stack[top--];
    }
    @Override
    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is Empty!!");
        return stack[top];
    }
    @Override
    public int size() {
        return top + 1;
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public boolean isFull() {
        return top == DEFAULT_CAPACITY - 1;
    }

    public String toString(){
        int current = 0;
        StringBuilder result = new StringBuilder();
        while(current<=top){
            result.append(stack[current]+ " ");
            current++;
        }
        return result.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<=top;
            }

            @Override
            public E next() {
                return stack[index++];
            }
        };
    }

}
