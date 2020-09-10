package lesson_136;

public class Receiver {

    public static String Activator(StringBuffer input) {

        StringBuffer stringBuffer = new StringBuffer();

        int count = 0;
        for (int i = 0, y = 0; i < input.length(); i++, y++) {
            if (input.charAt(i) == input.charAt(y)) {
                count++;
                y--;
            } else {

                y++;

                stringBuffer.append(count);
                stringBuffer.append(input.charAt(i - 1));
                count = 0;
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        //При можливості доопрацювати
        System.out.println(Activator(new StringBuffer("aavbbbbsdddd")));
    }
}
