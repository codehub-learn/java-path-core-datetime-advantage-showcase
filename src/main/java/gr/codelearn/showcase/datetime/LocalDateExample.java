package gr.codelearn.showcase.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        getValues();
        addAndSubtractDates();
        parseDate();
        compareDate();
    }


    public static void getValues() {
        System.out.println("---------------------");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date is: " + localDate);
        System.out.println("Current ERA: " + localDate.getEra());
        System.out.println("Current day of month: " + localDate.getDayOfMonth());
        System.out.println("Current year: " + localDate.getYear());
        System.out.println("Current month: " + localDate.getMonth());
    }

    public static void addAndSubtractDates() {
        System.out.println("---------------------");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date is: " + localDate);
        System.out.println("Yesterday was: " + localDate.minusDays(1));
        System.out.println("Tomorrow will be: " + localDate.plus(1, ChronoUnit.DAYS));
        System.out.println("One week later it will be: " + localDate.plusWeeks(1));
        System.out.println("Current date is: " + localDate);
    }

    public static void parseDate() {
        System.out.println("---------------------");
        LocalDate christmasOfNumeric = LocalDate.of(LocalDate.now().getYear(), 12, 25);
        System.out.println("The day of christmas for " + christmasOfNumeric.getYear() + " will be " + christmasOfNumeric.getDayOfWeek());
        LocalDate christmasOfEnum = LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25);
        System.out.println("Christmas using enum is: " + christmasOfEnum);
        LocalDate christmasParser = LocalDate.parse("2021-12-25");
        System.out.println("Christmas using parser: " + christmasParser);
    }

    public static void compareDate() {
        System.out.println("---------------------");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateYesterday = localDateNow.minusDays(1);

        System.out.println("Is " + localDateNow + " after " + localDateYesterday + " ? " + localDateNow.isAfter(localDateYesterday));
        System.out.println("Is " + localDateNow + " before " + localDateYesterday + " ? " + localDateNow.isBefore(localDateYesterday));
        System.out.println("Is " + localDateNow + " equal to " + localDateYesterday + " ? " + localDateNow.isEqual(localDateYesterday));
        System.out.println("Is " + localDateNow.getYear() +" a leap year ? " + localDateNow.isLeapYear());
    }
}
