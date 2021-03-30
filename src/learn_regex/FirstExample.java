package learn_regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstExample {

    public static void main(String[] args) {

        String text = "Hollo";
        String pattern = "H.llo";
        System.out.println(Pattern.matches(pattern, text));

        String textOne = "Hrllo";
        String patternOne = "H[a,e]llo";
        System.out.println(Pattern.matches(patternOne, textOne));

        String textTwo = "HEllo";
        String patternTwo = "H[a-eA-E]llo";
        System.out.println(Pattern.matches(patternTwo, textTwo));

        String textFour = "HEllo";
        String patternFour = "H[0-9]llo";
        System.out.println(Pattern.matches(patternFour, textFour));

        String textThree = "H8llo";
        String patternThree = "H[a-e0-9]llo";
        System.out.println(Pattern.matches(patternThree, textThree));

        String textFive = "H8llo";
        String patternFive = "H\\dllo";
        System.out.println(Pattern.matches(patternFive, textFive));

        String textSix = "Hp llo";
        String patternSix = "H\\D\\sllo";
        System.out.println(Pattern.matches(patternSix, textSix));

        String textSeven = "Hrllo";
        String patternSeven = "H\\wllo";
        System.out.println(Pattern.matches(patternSeven, textSeven));

        String textEight = "H^llo";
        String patternEight = "H\\Wllo";
        System.out.println(Pattern.matches(patternEight, textEight));


        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("abaaaba");
        while (m.find()) {
            System.out.print(m.start() + " ");
        }

        System.out.println();
        Pattern p1 = Pattern.compile("ab");
        Matcher m1 = p1.matcher("abaaaaefaaadddaba");
        System.out.println("Pattern is " + m1.pattern());
        System.out.println("is matches: " + m1.matches());
        while (m1.find()) {
            System.out.println(m1.start() + " " + m1.group());
        }


        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end taЬle");
        while (mat.find())
            System.out.println("Coвпaдeниe: " + mat.group());


        List<String> emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user_name@domain.co.in");
        emails.add("user-name@domain.co.in");
        emails.add("user@domaincom");
        emails.add("@yahoo.com");

        Pattern patterns = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

        for (String email : emails) {
            Matcher matcher = patterns.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }
}
