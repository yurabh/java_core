package learn_linkedlist_linkedlist_in_stack_stack_in_linkedlist_and_vector.first_example;

public class LinkedList {

    private Node first;
    private StackLinkedList stackLinkedList;

    public LinkedList() {
        this.first = null;
        this.stackLinkedList = new StackLinkedList(6);
    }


    public void insertToBegin(int id, double value) {
        Node newNode = new Node(id, value);
        newNode.next = first;
        first = newNode;
        if (!stackLinkedList.isFull()) {
            stackLinkedList.push(first);
        } else {
            System.out.println("у стек елемент не додасся бо переповнений");
        }
    }


    public Node deleteFirst() {
        Node tmpNode = first;
        if (tmpNode != null) {
            first = first.next;
        }

        if (!stackLinkedList.isEmpty()) {
            stackLinkedList.pop();
        }
        return tmpNode;
    }


    public StackLinkedList getStackLinkedList() {
        return stackLinkedList;
    }


    public Node find(int id) {
        Node tmpCurrent = first;
        Node tmpValue = null;
        while (tmpCurrent.next != null) {
            if (tmpCurrent.index == id) {
                tmpValue = tmpCurrent;
            }
            tmpCurrent = tmpCurrent.next;
        }
        if (tmpValue != null) {
            return tmpValue;
        } else {
            return null;
        }
    }


    public Node delete(int id) {
        Node currentNode = first;
        Node prevNode = first;
        while (currentNode.index != id) {
            if (currentNode.next == null) {
                System.out.println("element not found");
                return null;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        if (currentNode == first) {
            first = first.next;
        } else {
            prevNode.next = currentNode.next;
        }
        return currentNode;
    }


    public void addNewAfterAllElements(int id) {
        Node tmpValue = new Node(12, 13);
        Node CurrentNode = first;
        Node prevNode = first;
        if (CurrentNode != null) {
            while (CurrentNode.index != id && CurrentNode.next != null) {
                CurrentNode = CurrentNode.next;
                //prevNode.next = CurrentNode;
            }
        }
        if (CurrentNode == null) {
            System.out.println("Списук на даний момент пустий додаем елемент");
            tmpValue.next = first;
            first = tmpValue;
            CurrentNode = first;

        }
        if (CurrentNode.index == id && CurrentNode != tmpValue) {
            prevNode = CurrentNode;
            tmpValue.next = CurrentNode.next;
            prevNode.next = tmpValue;
        } else {
            System.out.println(" ");
            System.out.println("Не знайшлося елементу з даним елементом тому не додаем після якогось елемета");
        }
    }


    public void addNewBeforeAllElements(int id) {
        Node tmpValue = new Node(123, 134);
        Node CurrentNode = first;
        Node prevNode = first;
        if (CurrentNode != null) {
            while (CurrentNode.index != id && CurrentNode.next != null) {
                prevNode = CurrentNode;
                CurrentNode = CurrentNode.next;
            }
        }
        if (CurrentNode == null) {
            System.out.println("Список Пустий додаем елемент)))");
            tmpValue.next = first;
            first = tmpValue;
            CurrentNode = first;
        }
        if (CurrentNode != first && CurrentNode.index == id && CurrentNode != tmpValue) {
            prevNode.next = tmpValue;
            tmpValue.next = CurrentNode;
        }
        if (CurrentNode == first && CurrentNode.index == id && CurrentNode != tmpValue) {
            tmpValue.next = CurrentNode;
            first = tmpValue;
        }
        if (CurrentNode.index != id) {
            System.out.println();
            System.out.println("Не знайшлося елементу з айді що додати перед цим елементом");
        }
    }


    public void displayList() {
        System.out.print("\nList (fisrt-->last): ");
        Node currentNode = first;
        while (currentNode != null) {
            currentNode.showNode();
            currentNode = currentNode.next;
        }
    }
}
