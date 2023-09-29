import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyStack<T> {
    private int capacity;
    private List<FixedStack<T>> group;

    public MyStack(int capacity) {
        this.capacity = capacity;
        initializeGroup(capacity);
    }

    private void initializeGroup(int capacity) {
        group = new LinkedList<>();
        group.add(new FixedStack<T>(capacity));
        group.add(new FixedStack<T>(capacity));
        group.add(new FixedStack<T>(capacity));
    }

    public void insert(T element) {
        FixedStack<T> stack = getStackForInsertion();
        System.out.println(stack);
        stack.push(element);
    }

    public void remove(T element) {
        FixedStack<T> stack = getStackForRemoval();
        System.out.println(stack);
        stack.pop();
    }

    private FixedStack<T> getStackForInsertion() {
        for (int i = 0; i < group.size(); i++) {
            FixedStack<T> stack = group.get(i);
            if (stack.actualSize() < capacity) {
                return stack;
            }
        }
        throw new RuntimeException("All stacks are full");
    }

    private FixedStack<T> getStackForRemoval() {
        for (int i = group.size()-1; i >= 0; i--) {
            FixedStack<T> stack = group.get(i);
            if(stack.actualSize() > 0) {
                return stack;
            }
            throw new RuntimeException("No elements can be removed");
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "capacity=" + capacity +
                ", group=" + group +
                '}';
    }
}

