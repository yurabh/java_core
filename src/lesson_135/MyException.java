package lesson_135;

public class MyException extends Exception {

    private int x;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, int x) {
        super(message);
        this.x = x;
    }

    public int value() {
        return x;
    }

    public String getMessage() {
        return "Подробности сообщения: " + x + "  " + super.getMessage();
    }
}
