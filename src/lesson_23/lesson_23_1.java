package lesson_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson_23_1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ob = null;
        System.out.print("Ввведіть імя: ");
        ob = sc.nextLine();
        int count = 0;
        do {
            try {
                for (int i = 0; i < ob.length(); i++) {
                    char a = ob.charAt(i);
                    int b = (char) a;
                    if (b >= 65 && b <= 90 || b >= 97 && b <= 122) {
                        count++;
                        if (count == ob.length()) {
                            System.out.println("Ви ввели вірно Імя: " + ob);
                            break;
                        }
                    }
                    //System.out.println("char: " + a);
                    //System.out.println("int: " + b);
                }
                if (count != ob.length()) {
                    throw new Exception("Помилка");
                }
            } catch (Exception e) {
                System.out.println("Виключна ситація ви ввели недопустимий символ у імені");
                System.out.print("Введіть імя: ");
                ob = sc.nextLine();
                count = 0;
                //e.printStackTrace();
            }
        } while (count != ob.length());
    }


    public static void someFunct() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.print("d = ");
            try {
                int d = sc.nextInt();
                a = 50 / d;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("Помилка введення :" + e.getMessage());
                System.out.println("Спробуйте ще раз");
                //e.printStackTrace();
            }

        } while (true);
        System.out.println("a = " + a);

    }
}