package lesson_98;

public class NumberOpTest {

    public static void isOdd(int number) {
        if (number < 0 && number % 2 != 0) {
            System.out.println("number: " + number + " is possitiv and odd");
        }
    }

    public static void isEven(int number) {
        if (number > 0 && number % 2 == 0) {
            System.out.println("number: " + number + " is negativeand even");
        }
    }

    public static void numberCheck(NumberTest numberTest, int number) {
        numberTest.checkValue(number);
    }


    public static void main(String[] args) {

        NumberOpTest.isOdd(-5);

        NumberOpTest.isEven(6);

        NumberTest Odd = (number) -> {
            if (number < 0 && number % 2 != 0) {
                System.out.println("number: " + number + " is possitiv and odd");
            }
        };

        NumberTest Even = (number) -> {
            if (number > 0 && number % 2 == 0) {
                System.out.println("number: " + number + " is negativeand even");
            }
        };

        Odd.checkValue(-5);

        Even.checkValue(6);

        numberCheck((number) -> {
            if (number < 0 && number % 2 != 0)
                System.out.println("number: " + number + " is negativ and odd");
        }, -5);

        numberCheck((number) -> {
            if (number > 0 && number % 2 == 0)
                System.out.println("number: " + number + " is possitiv and even");
        }, 10);
    }
}
