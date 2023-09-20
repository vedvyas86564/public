import java.util.Objects;
//this is a DTO which is only used to store information, and has equals and hashcode
//DTO is used to pass information from classes(like a ship of information)
//DTO is one of the design patterns in CS
public class Node<E> {
    private E data;
    private Node next;

    public Node(E data) {
        this(data, null);
    }
    public Node(E data, Node next) {
        //this. means you are assigning the value of data to data using the same name
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

}
