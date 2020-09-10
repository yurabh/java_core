package lesson_134;

import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hollo";//Hrllo

        String pattern = "H.llo";//. - any symbol*/

        /*String text = "Hrllo";

        String pattern = "H[a,e]llo";//[a,e] - a or e must be*/

        /*String text = "HEllo";

        String pattern = "H[a-eA-E]llo";//[a-e] - from a to e(from first_example to E) must be*/

        /*String text = "HEllo";

        String pattern = "H[0-9]llo";//[0-9] - from 0 to 9 must be*/

      /*  String text = "H8llo";

        String pattern = "H[a-e0-9]llo";//[0-9] - from 0 to 9(from a to e) must be*/

        /*String text = "H8llo";

        String pattern = "H\\dllo";//[0-9] - from 0 to 9 must be*/

/*        String text = "Hp llo";

        String pattern = "H\\D\\sllo";//non digit*/

       /* String text = "Hrllo";

        String pattern = "H\\wllo";//word character*/

        String text = "H^llo";

        String pattern = "H\\Wllo";//word character

        System.out.println(Pattern.matches(pattern, text));
    }
}
