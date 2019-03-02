package pl.sda._JAVA_gda24_intro.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
        // #1
        localDate();

        // #2
        //localTime();

        // #3
        //localDateTime();

        // #4
        //dateTimeFormat();
        
        // #5
        //instant();
    }

    private static void dateTimeFormat() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateTimeAsString = localDateTime.format(DateTimeFormatter.ofPattern("d MMMM yyyy 'godzina:' HH:mm"));
        System.out.println("localDateTime = " + dateTimeAsString);

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String dateAsString = formatter.format(localDate);
        System.out.println("dateAsString = " + dateAsString);

        LocalTime localTime = LocalTime.now();
        System.out.println("timeAsString = " + DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(localTime));
    }

    private static void localDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);

        LocalDate localDateOf = LocalDate.of(2015, 2, 20);
        System.out.println("LocalDateOf: " + localDateOf);

        LocalDate localDateParse = LocalDate.parse("2015-02-20");
        System.out.println("LocalDateParse: " + localDateParse);

        LocalDate localDateTomorrow = LocalDate.now().plusDays(1);
        System.out.println("LocalDateTomorrow: " + localDateTomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("LocalDatePreviousMonthSameDay: " + previousMonthSameDay);

        DayOfWeek localDateSunday = LocalDate.parse("2017-12-31").getDayOfWeek();
        System.out.println("LocalDateSunday: " + localDateSunday);

        int localDateFirst = LocalDate.parse("2017-12-01").getDayOfMonth();
        System.out.println("LocalDateFirst: " + localDateFirst);

        boolean localDateLeapYear = LocalDate.now().isLeapYear();
        System.out.println("LocalDateLeapYear: " + localDateLeapYear);

        boolean localDateNotBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("LocalDateNotBefore: " + localDateNotBefore);

        boolean localDateIsAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("LocalDateIsAfter: " + localDateIsAfter);

        LocalDate localDateFirstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("LocalDateFirstDayOfMonth: " + localDateFirstDayOfMonth);
    }

    private static void localTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime: " + localTime);

        LocalTime localTimeNine = LocalTime.parse("09:00");
        System.out.println("LocalTimeNine: " + localTimeNine);

        LocalTime localTimeSixThirty = LocalTime.of(6, 30);
        System.out.println("LocalTimeSixThirty: " + localTimeSixThirty);

        LocalTime localTimeSevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println("LocalTimeSevenThirty: " + localTimeSevenThirty);

        int localTimeSix = LocalTime.parse("06:30").getHour();
        System.out.println("LocalTimeSix: " + localTimeSix);

        boolean localTimeIsbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("LocalTimeIsbefore: " + localTimeIsbefore);
    }

    private static void localDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        LocalDateTime localDateTimeOf = LocalDateTime.of(2017, Month.SEPTEMBER, 30, 6, 30);
        System.out.println("LocalDateTimeOf: " + localDateTimeOf);

        LocalDateTime localDateTimeParse = LocalDateTime.parse("2017-09-30T06:30:00");
        System.out.println("LocalDateTimeParse: " + localDateTimeParse);

        LocalDateTime localDateTimePlusDay = localDateTime.plusDays(1);
        System.out.println("LocalDateTimePlusDay: " + localDateTimePlusDay);

        LocalDateTime localDateTimeMinusTwoHours = localDateTime.minusHours(2);
        System.out.println("LocalDateTimeMinusTwoHours: " + localDateTimeMinusTwoHours);

        Month localDateTimeMonth = localDateTime.getMonth();
        System.out.println("LocalDateTimeMonth: " + localDateTimeMonth);

        LocalDateTime localDateTimeBeginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("LocalDateTimeBeginningOfDay: " + localDateTimeBeginningOfDay);
    }

    private static void instant() {
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

        Instant oneMiliSecondAfterEpoch = Instant.ofEpochMilli(1);
        System.out.println("oneMiliSecondAfterEpoch = " + oneMiliSecondAfterEpoch);

        Instant christmas = Instant.parse("2018-12-24T16:15:30Z");
        System.out.println("christmas = " + christmas);
    }
}
