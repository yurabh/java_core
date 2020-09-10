package homeWork23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayNegativeSizeException {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Введіть size елементыв масиву: ");
                size = sc.nextInt();
                int[] ar = new int[size];
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                sc.nextLine();
            } catch (NegativeArraySizeException e) {
                System.out.println("Результат : " + e.getMessage());
                System.out.println("Не вірно введено кількість елементів у масив");
            }
        } while (true);
        System.out.println("Кількість елементів масиву : " + size);
    }
}
