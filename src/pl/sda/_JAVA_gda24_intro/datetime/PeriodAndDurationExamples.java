package pl.sda._JAVA_gda24_intro.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationExamples {
    public static void main(String[] args) {
        // #1
        period();

        // #2
        //duration();
    }

    private static void period() {
        LocalDate initialDate  = LocalDate.parse("2017-09-30");
        LocalDate finalDate = LocalDate.parse("2018-10-01");
        Period period = Period.between(finalDate, initialDate);
        System.out.println("Period: " + period); //

        System.out.println("PeriodInitialDate: " + initialDate.getDayOfWeek());

        finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("PeriodFinalDate: " + finalDate);

        period = Period.between(finalDate, initialDate);
        System.out.println("Period 1: " + period);
        int periodDays1 = period.getDays();
        System.out.println("PeriodDays 1: " + periodDays1);

        long periodDays2 = ChronoUnit.DAYS.between(initialDate , initialDate);
        System.out.println("PeriodDays 2: " + periodDays2);
    }

    private static void duration() {
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = LocalTime.of(15, 30, 0);
        Duration duration = Duration.between(finalTime, initialTime);
        System.out.println("Duration: " + duration);//P-1Y-1D

        System.out.println("DurationInitialTime: " + initialTime);

        finalTime = initialTime.plus(Duration.ofSeconds(30));
        System.out.println("DurationFinalTime: " + finalTime);

        duration = Duration.between(finalTime, initialTime);
        System.out.println("Duration 1: " + duration);
        long durationSeconds1 = duration.getSeconds();
        System.out.println("DurationSeconds 1: " + durationSeconds1);

        long durationSeconds2 = ChronoUnit.SECONDS.between(finalTime, initialTime);
        System.out.println("DurationSeconds 2: " + durationSeconds2);
    }
}
