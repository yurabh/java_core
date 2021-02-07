package learn_linkedlist_linkedlist_in_stack_stack_in_linkedlist_and_vector.first_example;

public class Runner {

    public static void main(String[] args) {

        LinkedList someList = new LinkedList();

        StackLinkedList stackLink = new StackLinkedList(10);

        someList.insertToBegin(9, 20.8);
        someList.insertToBegin(50, 89.4);
        someList.insertToBegin(5, 28.1);
        someList.insertToBegin(11, 28.1);
        someList.insertToBegin(112, 28.1);
        someList.deleteFirst();
        someList.insertToBegin(11, 28.1);

        someList.delete(50);
        stackLink.showStackLink();

        StackLinkedList ob = someList.getStackLinkedList();
        ob.showStackLink();
        Node TmpNode = someList.deleteFirst();
        TmpNode.showNode();
        System.out.println(" ");
        stackLink.showStackLink();
        StackLinkedList ob1 = someList.getStackLinkedList();
        ob1.showStackLink();
        System.out.println(" ");
        Node Tmp1Node = ob.peek();
        Tmp1Node.showNode();
        System.out.println(" ");
        someList.deleteFirst();
        someList.displayList();
        someList.delete(9);
        someList.displayList();
        someList.deleteFirst();
        Node nod = someList.find(12);
        System.out.println("show found element");
        nod.showNode();
        System.out.println();
        LinkedList someList1 = new LinkedList();
        someList1.insertToBegin(9, 20.8);
        someList1.insertToBegin(50, 89.4);
        someList1.insertToBegin(5, 28.1);

        someList.addNewAfterAllElements(12);
        someList.displayList();
        someList.addNewAfterAllElements(501);
        someList.displayList();
        someList.addNewAfterAllElements(50);
        someList.displayList();
        someList1.addNewAfterAllElements(93);
        someList1.displayList();
        System.out.println();
        System.out.println("Before");
        someList1.addNewBeforeAllElements(121);
        someList1.displayList();
        someList1.addNewBeforeAllElements(9);
        someList1.displayList();
        someList1.addNewBeforeAllElements(50);
        someList1.displayList();

        someList1.addNewBeforeAllElements(11);
        someList1.displayList();


        Node node = new Node(1, 22.2);
        Node node1 = new Node(12, 22.2);
        Node node2 = new Node(13, 22.2);
        Node node3 = new Node(14, 22.2);
        Node node4 = new Node(15, 22.2);
        Node node5 = new Node(16, 22.2);
        Node node6 = new Node(17, 22.2);
        Node node7 = new Node(18, 22.2);
        LinkedListInStack linkedListinStack = new LinkedListInStack();
        linkedListinStack.push(node);
        linkedListinStack.push(node1);
        linkedListinStack.push(node2);
        linkedListinStack.push(node3);
        linkedListinStack.push(node4);
        linkedListinStack.push(node5);
        linkedListinStack.push(node6);
        linkedListinStack.push(node7);
        linkedListinStack.showLinkedListStack();
        linkedListinStack.showLinkedListStack();
        System.out.println("get deleted");
        Node nodes = linkedListinStack.pop();
        nodes.showNode();
        Node nodes1 = linkedListinStack.pop();
        nodes.showNode();
        Node nodes2 = linkedListinStack.pop();
        linkedListinStack.showLinkedListStack();
        Node nodes4 = linkedListinStack.pop();
        linkedListinStack.showLinkedListStack();
        Node nodes5 = linkedListinStack.pop();
        linkedListinStack.showLinkedListStack();
        Node object1 = linkedListinStack.peek();
        System.out.println("get peek");
        object1.showNode();
    }
}
