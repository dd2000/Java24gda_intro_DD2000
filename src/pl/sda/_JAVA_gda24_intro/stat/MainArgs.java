package pl.sda._JAVA_gda24_intro.stat;

public class MainArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There are no arguments!");
            return;
        }

        String name = args[0];
        String number = "?";
        if (args.length > 1) {
            number = args[1];
        }

        System.out.println("Hello " + name + " - your number is: " + number);
    }
}
