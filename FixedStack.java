import java.util.Arrays;

public class FixedStack<T> {
    private T[] stack;
    private int capacity;
    private int top;

    public FixedStack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public int actualSize() {
        return top + 1;
    }
    public void push(T obj) {
        if (top >= capacity)
            throw new IndexOutOfBoundsException("Stack size = " + capacity);
        stack[++top] = obj;
    }

    public T pop() {
        if (top < 0) throw new IndexOutOfBoundsException();
        T obj = stack[top--];
        stack[top + 1] = null;
        return obj;
    }

    public int size() {
        return capacity;
    }

    public int elements() {
        return top + 1;
    }

    @Override
    public String toString() {
        return "FixedStack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + capacity +
                ", top=" + top +
                '}';
    }

}

