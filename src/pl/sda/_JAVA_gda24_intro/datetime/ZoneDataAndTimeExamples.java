package pl.sda._JAVA_gda24_intro.datetime;

import java.time.*;

public class ZoneDataAndTimeExamples {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        ZoneId zoneId = ZoneId.of("Europe/Warsaw");
        System.out.println("ZoneId: " + zoneId);

        //System.out.println("All ZoneId: " + ZoneId.getAvailableZoneIds());

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("ZonedDateTime.withZoneSameLocal(Hongkong): " + zonedDateTime.withZoneSameLocal(ZoneId.of("Hongkong")));
        System.out.println("ZonedDateTime.withZoneSameInstant(Hongkong): " + zonedDateTime.withZoneSameInstant(ZoneId.of("Hongkong")));
        System.out.println("ZonedDateTimeParse: " + ZonedDateTime.parse("2017-09-30T10:15:30+02:00[Europe/Warsaw]"));

        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
        System.out.println("ZoneOffset: " + zoneOffset);

        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, zoneOffset);
        System.out.println("OffSetByTwo: " + offSetByTwo);
    }
}
