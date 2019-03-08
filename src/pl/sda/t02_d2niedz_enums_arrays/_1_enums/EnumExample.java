package pl.sda.t02_d2niedz_enums_arrays._1_enums;

public class EnumExample {

    public static void main(String[] args) {
        // iteracja po wszystkich elementach/wartościach enuma

        // analogiczna pętla for (;;)
//        for (int i = 0; i < 7; i++) {
//            Days element = Days.get(i);
//        }

        for (Days day : Days.values()) {
            System.out.println(day);
//            System.out.println("Day of week: " + day.getDayOfWeek() + ", name: " + day.getName());
        }

//        for (Days day : Days.values()) {
//            // #1
//            day = Days.MONDAY;
//            System.out.println(day);
//            System.out.println("Day of week: " + day.getDayOfWeek() + ", name: " + day.getName());
//
//            // #2
//            day = Days.TUESDAY;
//            System.out.println(day);
//            System.out.println("Day of week: " + day.getDayOfWeek() + ", name: " + day.getName());
//
//            // #3
//            day = Days.WEDNESDAY;
//            System.out.println(day);
//            System.out.println("Day of week: " + day.getDayOfWeek() + ", name: " + day.getName());
//
//            // ...
//
//            // #7
//            day = Days.SUNDAY;
//            System.out.println(day);
//            System.out.println("Day of week: " + day.getDayOfWeek() + ", name: " + day.getName());
//        }

//        System.out.println("===");
//
//        // metoda valueOf zwraca wartość enuma o nazwie podanej w parmetrze
//        Days monday = Days.valueOf("MONDAY");
//        System.out.println(monday);
//        System.out.println(monday.getDayOfWeek());
//        System.out.println(monday.getName());
//
//        System.out.println("===");
//
        // instrukcja switch bardzo dobrze współpracuje z enumami
//        switch (monday) {
//            case MONDAY:
//                System.out.println("It's the first day of the week!");
//                break;
//            case TUESDAY:
//                System.out.println("It's the second day of the week!");
//                break;
//            case WEDNESDAY:
//                System.out.println("It's the third day of the week!");
//                break;
//            case THURSDAY:
//                System.out.println("It's the fourth day of the week!");
//                break;
//            case FRIDAY:
//                System.out.println("It's the fifth day of the week!");
//                break;
//            case SATURDAY:
//                System.out.println("It's the sixth day of the week!");
//                break;
//            case SUNDAY:
//                System.out.println("It's the seventh day of the week!");
//                break;
//        }
    }
}
