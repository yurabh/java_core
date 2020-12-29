package learn_linkedList_linkedListInStack_stackInLinkedList;

public class StackLinkedList {

    private Node firs;
    private int size;
    private Node top;

    public StackLinkedList(int size) {
        this.firs = null;
        this.size = size;
        this.top = null;
    }

    public boolean isEmpty() {
        return firs == null;
    }

    public boolean isFull() {
        return top != null;
    }

    public void push(Node newNode) {
        if (!isFull()) {
            newNode.next = firs;
            firs = newNode;
        } else {
            System.out.println("Не можем додати у стек більше елементів бо стек переповниний");
        }
    }


    public Node pop() {
        if (!isEmpty()) {
            Node tmp = firs;
            firs = firs.next;
            return tmp;
        } else {
            System.out.println("Стек Пустий");
            return null;
        }
    }


    public Node peek() {
        if (!isEmpty()) {
            Node tmpCurent = firs;
            return tmpCurent;
        } else {
            System.out.println("Не можливо повернути стек пустий");
            return null;
        }

    }


    public void showStackLink() {

        Node CurrentNode = firs;
        while (CurrentNode != null) {
            CurrentNode.showNode();
            CurrentNode = CurrentNode.next;
        }
    }
}
