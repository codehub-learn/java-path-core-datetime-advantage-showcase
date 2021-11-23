package gr.codelearn.showcase.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {
    public static void main(String[] args) {
        examples();
        customAdjuster();
    }

    public static void examples() {
        System.out.println("---------------------");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date is: " + localDate);
        System.out.println("Second Monday of the month is: " + localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY)));
        TemporalAdjuster temporalAdjusterNextFriday = TemporalAdjusters.next(DayOfWeek.FRIDAY);
        System.out.println("Next friday is: "+ localDate.with(temporalAdjusterNextFriday));
    }

    public static void customAdjuster() {
        System.out.println("---------------------");
        LocalDate localDate = LocalDate.now();
        CustomTemporalAdjusterNextTwoWeeks ctantw = new CustomTemporalAdjusterNextTwoWeeks();
        System.out.println("Current date is: " + localDate + ". After two weeks it will be: "+ localDate.with(ctantw));
    }


}

class CustomTemporalAdjusterNextTwoWeeks implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.WEEKS);
    }
}
