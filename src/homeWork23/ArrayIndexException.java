package homeWork23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexException {

    private int ar[];
    private int size;

    public ArrayIndexException() {
        this.ar = null;
        this.size = 0;
    }

    public void size() throws Exception {

        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Введіть сайз масиву: ");
                size = sc.nextInt();
                ar = new int[size];
                break;
            } catch (NegativeArraySizeException e) {
                System.out.println("Результат : " + e.getMessage());
                System.out.println("Не вірно введено кількість елементів у масив");
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                sc.nextLine();
            } finally {
                try {
                    System.out.println("Somevcode");
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
                    ar[i] = 113;
                }
                System.out.println("Введіть індекс в який ви бажаете замінити елемент: ");
                index = sc.nextInt();
                if (index > 0 && index < size) {
                    ar[index] = 12;
                    System.out.println("Під цим індексом додато: " + index);
                    for (int i = 0; i < size; i++) {
                        System.out.println(ar[i]);
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
                    ar1[i] = ar[i];
                }
                ar1[size] = 666;
                ar = ar1;
                System.out.println("Під індекс: " + size);
                for (int i = 0; i < size + 1; i++) {
                    System.out.println(ar[i]);
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
                    ar2[i] = ar[i];
                }
                for (int i = size; i < index; i++) {
                    ar2[i] = 777;
                }
                ar = ar2;
                System.out.println("Стало індексів:" + suma);
                for (int i = 0; i < index; i++) {
                    System.out.println(ar[i]);
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
