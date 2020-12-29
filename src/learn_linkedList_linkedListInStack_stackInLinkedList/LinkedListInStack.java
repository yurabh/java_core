package learn_linkedList_linkedListInStack_stackInLinkedList;

public class LinkedListInStack {

    private LinkedList linkedList;
    private Node top;
    private int size;


    public LinkedListInStack() {
        this.linkedList = new LinkedList();
        this.top = null;
        this.size = 6;
    }

    public LinkedListInStack(LinkedList linkedList, Node top, int size) {
        this.linkedList = linkedList;
        this.top = top;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        Node CurrentNode = top;
        int count = 0;
        while (CurrentNode != null) {
            count++;
            CurrentNode = CurrentNode.next;
        }
        if (count == size) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Node newNode) {

        if (!isFull()) {
            System.out.println("Додаем елемент");
            newNode.next = top;
            top = newNode;
            linkedList.insertToBegin(newNode.index, newNode.value);
        } else {
            System.out.println("Стек Переповнений");
        }
    }

    public Node peek() {
        if (!isEmpty()) {
            return top;
        } else {
            System.out.println("Стек пустий + Лінкед ліст пустий");
            return null;
        }
    }

    public Node pop() {
        if (!isEmpty()) {
            Node CurrentNode = top;
            top = top.next;
            linkedList.deleteFirst();
            return CurrentNode;
        } else {
            System.out.println("Неможливо видали вузол стек пустий");
            return null;
        }
    }

    public void showLinkedListStack() {

        linkedList.displayList();
        if (linkedList != null && top != null) {
            System.out.println(" ");
            System.out.println("Firs: " + top.value);
            System.out.println("Максимальна кількість елементів у стеку: " + size);
        }
    }
}
