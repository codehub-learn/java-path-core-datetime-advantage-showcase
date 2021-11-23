package gr.codelearn.showcase.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantAndZoneExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("UTC time is: " + instant);
        System.out.println("Current millis are " + instant.toEpochMilli());
        System.out.println("System default zone is: " + ZoneId.systemDefault());
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZoneId greeceZone = ZoneId.of("Europe/Athens");
        System.out.println("Time in Greece is "+ instant.atZone(greeceZone));
        ZoneId chicagoZone = ZoneId.of("America/Chicago");
        LocalDateTime localDateTime = LocalDateTime.now(chicagoZone);
        System.out.println("Localdatetime at Chicago is: "+ localDateTime);
    }
}
