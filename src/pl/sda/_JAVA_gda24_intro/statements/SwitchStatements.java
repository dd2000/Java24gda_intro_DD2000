package pl.sda._JAVA_gda24_intro.statements;

public class SwitchStatements {
    public static void main(String[] args) {
        /*
           Prosty switch na zmiennej typu char
         */
        int a = 3;
        int b = 4;
        int result = 0;

        char op = '-';

        /*if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.println("Unknown type!");
        }*/

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Unknown type!");
        }

        System.out.println("result = " + result);

        /*
           Switch na Stringach z połączonymi etykietami case
         */
        /*String dayOfWeekArg = "Tuesday";
        String typeOfDay = "";

        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                System.out.println("Invalid day of the week: " + dayOfWeekArg);
        }

        System.out.println("typeOfDay = " + typeOfDay);*/
    }
}
