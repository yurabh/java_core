package learn_linkedList_linkedListInStack_stackInLinkedList;

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
