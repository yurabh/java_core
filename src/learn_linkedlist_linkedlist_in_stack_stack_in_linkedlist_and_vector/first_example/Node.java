package learn_linkedlist_linkedlist_in_stack_stack_in_linkedlist_and_vector.first_example;

public class Node {
    public int index;
    public double value;
    public Node next;

    public Node(int index, double value) {
        this.index = index;
        this.value = value;
        this.next = null;
    }

    public void showNode() {
        System.out.print("{" + index + "," + value + "}");
    }
}
