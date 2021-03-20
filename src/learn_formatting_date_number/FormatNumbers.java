package learn_formatting_date_number;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String[] args) throws ParseException {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
        double price = 48;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.format(price));

        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        String s = "40.45";
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));

        float f1 = 123.45678f;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.print(nf.getMaximumFractionDigits() + " ");
        System.out.print(nf.format(f1) + " ");
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(f1) + " ");
        try {
            System.out.println(nf.parse("1234.567"));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse("1234.567"));
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.
                ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));

        DateTimeFormatter shortDateTimeTwo =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTimeTwo));
        System.out.println(date.format(shortDateTimeTwo));

        LocalDate dateTwo = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime timeTwo = LocalTime.of(11, 12, 34);
        LocalDateTime dateTimeTwo = LocalDateTime.of(dateTwo, timeTwo);
        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTimeTwo));
        System.out.println(mediumF.format(dateTimeTwo));

        Date d1 = new Date(1000000000000L);
        System.out.println("1st date " + d1.toString());
        Calendar c = Calendar.getInstance();
        c.setTime(d1);

        if (Calendar.SUNDAY == c.getFirstDayOfWeek())
            System.out.println("Sunday is the first day of the week");
        System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK));
        c.add(Calendar.MONTH, 1);
        Date d2 = c.getTime();
        System.out.println("new date " + d2.toString());

        Date d3 = new Date(1000000000000L);
        System.out.println("d1 = " + d3.toString());

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s1 = df.format(d3);
        System.out.println(s1);
        try {
            Date d4 = df.parse(s1);
            System.out.println("parsed = " + d4.toString());
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
