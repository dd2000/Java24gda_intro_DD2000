package pl.sda._JAVA_gda24_intro.datatypes;

public class Wrappers {
    public static void main(String[] args) {
        //zakres danych dla typów prymitywnych
        System.out.println("byte range: " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE);
        System.out.println("float range: " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);
        System.out.println("chare range: " + (int) Character.MIN_VALUE + "(" + Character.MIN_VALUE + ")" + " <--> " + (int) Character.MAX_VALUE + "(" + Character.MAX_VALUE + ")");

        //parsowanie liczb z napisów
        String intString = "1400";
        int iNumber = Integer.parseInt(intString);
        System.out.println("iNumber = " + iNumber);

        String floatString = "4.4";
        float fNumber = Float.parseFloat(floatString);
        System.out.println("fNumber = " + fNumber);

        String byteString = "6";
        byte bNumber = Byte.parseByte(byteString);
        System.out.println("bNumber = " + bNumber);

        //kilka użytecznych metod klasy Character
        char numberChar = '1';
        char lowLetterChar = 'g';
        char upLetterChar = 'J';
        System.out.println(numberChar + " isNumber = " + Character.isDigit(numberChar));
        System.out.println(lowLetterChar + " isNumber = " + Character.isDigit(lowLetterChar));
        System.out.println(lowLetterChar + " isLetter = " + Character.isLetter(lowLetterChar));
        System.out.println(numberChar + " isLetter = " + Character.isLetter(numberChar));
        System.out.println(numberChar + " isUpperCase = " + Character.isUpperCase(numberChar));
        System.out.println(lowLetterChar + " isUpperCase = " + Character.isUpperCase(lowLetterChar));
        System.out.println(upLetterChar + " isUpperCase = " + Character.isUpperCase(upLetterChar));
    }
}
