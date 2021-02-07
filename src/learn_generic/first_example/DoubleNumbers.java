package learn_generic.first_example;

import java.util.Scanner;

public class DoubleNumbers extends WorkGeneric<Double> {

    @Override
    public void insertIntoSort() {
        Double temp;

        int j;
        int length = numberList.size();
        for (int i = 0; i < length - 1; i++) {
            if (numberList.get(i) > numberList.get(i + 1)) {
                Double temp1 = numberList.get(i + 1);
                numberList.set(i + 1, numberList.get(i));
                j = i;
                while (j > 0 && temp1 < numberList.get(j - 1)) {
                    numberList.set(j, numberList.get(j - 1));
                    j--;
                }
                numberList.set(j, temp1);
            }
        }
    }

    @Override
    public void addElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        Double someNumber = sc.nextDouble();
        numberList.add(someNumber);
    }

    @Override
    protected int findElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for searching: ");
        Double value = sc.nextDouble();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i).equals(value)) {
                System.out.println("element: " + numberList.get(i).toString());
                System.out.println(" ");
                return i;
            }
        }
        return -1;
    }
}
