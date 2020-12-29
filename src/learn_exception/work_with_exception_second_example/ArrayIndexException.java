package learn_exception.work_with_exception_second_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexException {

    private int array[];
    private int size;

    public ArrayIndexException() {
        this.array = null;
        this.size = 0;
    }

    public void size() throws Exception {

        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("enter count array: ");
                size = sc.nextInt();
                array = new int[size];
                break;
            } catch (NegativeArraySizeException e) {
                System.out.println("Результат : " + e.getMessage());
                System.out.println("Не вірно введено кількість елементів у масив");
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                sc.nextLine();
            } finally {
                try {
                    System.out.println("Some code");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } while (true);
        System.out.println("Кількість елементів масиву : " + size);
    }


    public void index() throws Exception {
        do {
            Scanner sc = new Scanner(System.in);
            int index = 0;
            try {
                for (int i = 0; i < size; i++) {
                    array[i] = 113;
                }
                System.out.println("Введіть індекс в який ви бажаете замінити елемент: ");
                index = sc.nextInt();
                if (index > 0 && index < size) {
                    array[index] = 12;
                    System.out.println("Під цим індексом додато: " + index);
                    for (int i = 0; i < size; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                }
                if (index > size) {
                    throw new Exception("Помилка вводу індекса більша за кількість елентів у масиві");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Причина: " + e.getMessage());
                System.out.println("індекс на 1 - цю більший створим новий масив");
                int[] ar1 = new int[size + 1];
                for (int i = 0; i < size; i++) {
                    ar1[i] = array[i];
                }
                ar1[size] = 666;
                array = ar1;
                System.out.println("Під індекс: " + size);
                for (int i = 0; i < size + 1; i++) {
                    System.out.println(array[i]);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
            } catch (Exception e) {
                System.out.println("Зловили помилку");
                int suma = size + index;
                int[] ar2 = new int[suma];
                System.out.println("Скільки тепер мае бути елементів масиву" + suma);
                for (int i = 0; i < size; i++) {
                    ar2[i] = array[i];
                }
                for (int i = size; i < index; i++) {
                    ar2[i] = 777;
                }
                array = ar2;
                System.out.println("Стало індексів:" + suma);
                for (int i = 0; i < index; i++) {
                    System.out.println(array[i]);
                }
                break;
            }
        } while (true);
    }

    public static void main(String[] args) throws Exception {
        ArrayIndexException arrayIndexException = new ArrayIndexException();
        try {
            arrayIndexException.size();
        } catch (Exception e) {
            System.out.println("ddffsdfs");
        }
        arrayIndexException.index();
    }
}
