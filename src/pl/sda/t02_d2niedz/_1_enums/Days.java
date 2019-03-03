package pl.sda.t02_d2niedz._1_enums;

public enum Days {
    MONDAY(1, "monday"),
    TUESDAY(2, "tuesday"),
    WEDNESDAY(3, "wednesday"),
    THURSDAY(4, "thursday"),
    FRIDAY(5, "friday"),
    SATURDAY(6, "saturday"),
    SUNDAY(7, "sunday");

    private int dayOfWeek;
    private String name;

    Days(int dayOfWeek, String name) {
        this.dayOfWeek = dayOfWeek;
        this.name = name;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Day of week: " + dayOfWeek + ", name: " + name;
    }
}
