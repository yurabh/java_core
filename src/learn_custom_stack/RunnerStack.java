package learn_custom_stack;

public class RunnerStack {

    public static void main(String[] args) {

        MyStack mystack = new MyStack(9);

        System.out.println("is full: " + mystack.isFull() + "\n");

        System.out.println("name stack: " + mystack.getClass() + "\n");

        System.out.println("hash code: " + mystack.hashCode() + "\n");

        boolean z = mystack.isEmpty() ? true : false;

        System.out.println("stack empty or not: " + z + "\n");

        int n = mystack.peek();

        System.out.println("the highest element of stack : " + n + "\n");

        System.out.println("out put stack: " + mystack.toString() + "\n");

        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.push(6);
        mystack.push(7);
        mystack.push(8);
        mystack.push(9);
        mystack.push(10);
        mystack.push(11231);
        mystack.push(11231131);


        System.out.println("is full: " + mystack.isFull() + "\n");

        System.out.println("the highest element of stack: " + mystack.peek() + "\n");

        boolean z1 = mystack.isEmpty() ? true : false;

        System.out.println("isEmpty or not: " + z1);

        System.out.println("show stack: " + mystack.toString() + "\n");

        System.out.println("size stack: " + mystack.getSize() + "\n");

        System.out.println("pop element from the stack: " + mystack.pop() + "\n");

        System.out.println("show stack: " + mystack.toString() + "\n");

        MyStack ob = new MyStack();

        System.out.println("about equal two stacks : " + mystack.equals(ob) + "\n");

        mystack.showInfo();
    }
}
