package learn_localization_internatiolization.second_example;

import java.util.Locale;
import java.util.ResourceBundle;

public class ZooOpen {

    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale uk = new Locale("uk", "UK");

        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
        System.out.println();

        ResourceBundle rbTwo = ResourceBundle.getBundle("Zoo", france);
        System.out.println(rbTwo.getString("hello"));
        System.out.println(rbTwo.getString("open"));
        System.out.println();

        ResourceBundle rbThree = ResourceBundle.getBundle("Zoo", uk);
        System.out.println(rbThree.getString("hello"));
        System.out.println(rbThree.getString("open"));
        System.out.println();
    }
}
