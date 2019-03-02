package pl.sda._JAVA_gda24_intro.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateAndCalendarExamples {
    public static void main(String[] args) {
        // #1
        date();

        // #2
        //calendar();

        // #3
        //dateToCalendar();

        // #4
        //dateTimeFormat();
    }

    private static void date() {
        Date now = new Date();
        System.out.println("Current date: " + now);

        Date epoch = new Date(1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("One miliseconds after EPOCH: " + dateFormat.format(epoch));

        System.out.println("Now is older: " + now.before(epoch));
        System.out.println("Epoch is older: " + now.after(epoch));
    }

    private static void calendar() {
        Calendar now = Calendar.getInstance();
        System.out.println("Current calendar: " + now.getTime());

        TimeZone timeZone = TimeZone.getTimeZone("America/Toronto");
        Calendar nowInToronto = Calendar.getInstance(timeZone);
        System.out.println("Current calendar in Toronto: " + nowInToronto);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        dateFormat.setTimeZone(timeZone);
        System.out.println("Current calendar in Toronto: " + dateFormat.format(nowInToronto.getTime()));

        Calendar beginOf21century = Calendar.getInstance();
        beginOf21century.set(Calendar.YEAR, 2000);
        beginOf21century.set(Calendar.MONTH, 1);
        beginOf21century.set(Calendar.DAY_OF_MONTH, 1);
        beginOf21century.set(Calendar.HOUR_OF_DAY, 0);
        beginOf21century.set(Calendar.MINUTE, 0);
        beginOf21century.set(Calendar.SECOND, 0);
        System.out.println("Begin of 21th century calendar: " + beginOf21century.getTime());
    }

    private static void dateToCalendar() {
        Calendar oneMonthBefore = Calendar.getInstance();
        oneMonthBefore.add(Calendar.MONTH, -1);
        System.out.println("One month before calendar: " + oneMonthBefore);

        Date oneMonthBeforeTime = oneMonthBefore.getTime();
        System.out.println("One month before date: " + oneMonthBeforeTime);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(oneMonthBeforeTime);
        System.out.println("Calendar from oneMonthBeforeTime: " + calendar);
    }

    private static void dateTimeFormat() {
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date now = new Date();
        String dateAsString = dateTimeFormat.format(now);
        System.out.println("Today is: " + dateAsString);

        SimpleDateFormat frenchDateFormat = new SimpleDateFormat("d MMMMM yyyy, HH:mm:ss, EEEE, zzzz", Locale.CANADA_FRENCH);
        frenchDateFormat.setTimeZone(TimeZone.getTimeZone("Canada/Central"));
        System.out.println("Today in Canada is: " + frenchDateFormat.format(now));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateFromString = dateFormat.parse("2018-05-15");
            System.out.println("dateFromString = " + dateFromString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
