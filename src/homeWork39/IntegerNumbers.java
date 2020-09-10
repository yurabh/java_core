package homeWork39;

import java.util.Scanner;

public class IntegerNumbers extends WorkGeneric<Integer> {

    @Override
    public void insertIntoSort() {
        Integer temp;
        int j;
        int length = numberList.size();
        for (int i = 0; i < length - 1; i++) {
            if (numberList.get(i).doubleValue() > numberList.get(i + 1).doubleValue()) {
                Integer temp1 = numberList.get(i + 1);
                numberList.set(i + 1, numberList.get(i));
                j = i;
                while (j > 0 && temp1.doubleValue() < numberList.get(j - 1).doubleValue()) {
                    numberList.set(j, numberList.get(j - 1));
                    j--;
                }
                numberList.set(j, temp1);
            }
        }
    }


    protected int FindElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число яке ви шукаєте");
        Integer value = sc.nextInt();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i).equals(value)) {
                System.out.println("Ми знайщли елемент: " + numberList.get(i).toString());
                System.out.println(" ");
                return i;
            }
        }
        return -1;
    }


    @Override
    public void addElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        Integer someNumber = sc.nextInt();
        numberList.add(someNumber);
    }
}
