package learn_localization_internatiolization.first_example;

import java.util.Locale;

public class LearnLocale {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println(l1);
        System.out.println(l2);
    }
}
