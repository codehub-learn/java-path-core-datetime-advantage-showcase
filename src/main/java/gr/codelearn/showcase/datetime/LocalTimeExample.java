package gr.codelearn.showcase.datetime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        getValues();
        modifyTime();
        parseTime();
    }

    public static void getValues(){
        System.out.println("---------------------");
        LocalTime localTime = LocalTime.now();
        System.out.println("Current time is: "+ localTime);
        System.out.println("Current minutes are: "+ localTime.getMinute());
        System.out.println("Current nanoseconds are: "+ localTime.getNano());
        System.out.println("Max time is: "+ LocalTime.MAX);
        System.out.println("Min time is: "+ LocalTime.MIN);
    }

    public static void modifyTime(){
        System.out.println("---------------------");
        LocalTime localTime = LocalTime.now();
        System.out.println("Current time is: "+ localTime);
        System.out.println("After one hour it will be: "+ localTime.plusHours(1));

        System.out.println("Replace "+ localTime + " minutes field with 45. Modified time is: "+ localTime.withMinute(45));
    }

    public static void parseTime(){
        System.out.println("---------------------");
        LocalTime midnight = LocalTime.parse("00:00");
        System.out.println("Midnight time is: "+ midnight);
        LocalTime hoursAndMinutes = LocalTime.of(14,15);
        System.out.println("Hours and minutes time is: "+ hoursAndMinutes);
        LocalTime secondsOfDay = LocalTime.ofSecondOfDay(35000);
        System.out.println("Time from 00:00 after 35000 seconds is: "+ secondsOfDay);
    }
}
