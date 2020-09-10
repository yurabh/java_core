package lesson_16;

public class RunnerStack {
    public static void main(String[] args) {

        MyStack mystack = new MyStack(9);
        System.out.println("is full sapovnenuy cu ni: " + mystack.isFull());
        System.out.println("");
        System.out.println("Imja steky: " + mystack.getClass());
        System.out.println("");
        System.out.println("Hash Kod: " + mystack.hashCode());
        boolean z = mystack.isEmpty() ? true : false;
        System.out.println("");
        System.out.println("Cu pustuy Stek: " + z);
        System.out.println("");
        int n = mystack.peek();
        System.out.println("Verxniy element steky peek : " + n);
        System.out.println("");
        System.out.println("Vuvid steky: " + mystack.toString());
        System.out.println("");
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
        System.out.println("is full sapovnenuy cu ni: " + mystack.isFull());
        System.out.println("Verxniy element steky : " + mystack.peek());
        boolean z1 = mystack.isEmpty() ? true : false;
        System.out.println("Cu pustuy Stek: " + z1);
        System.out.println("Vuvid steky: " + mystack.toString());
        System.out.println("Kilkistj elementiv y steky: " + mystack.getSize());
        System.out.println("PoP elementStack: " + mystack.pop());
        System.out.println("Vuvid steky: " + mystack.toString());
        MyStack ob = new MyStack();
        System.out.println("Cu rivni objectu : " + mystack.equals(ob));
        mystack.showInfo();
    }
}
