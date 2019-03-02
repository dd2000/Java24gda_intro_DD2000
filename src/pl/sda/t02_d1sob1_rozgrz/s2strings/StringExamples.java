package pl.sda.t02_d1sob1_rozgrz.s2strings;

public class StringExamples {
    public static void main(String[] args) {
        // #1
        stringEquals();

        // #2
        //numberVsString();

        // #3
        //concatenation();

        // #4
        //stringMethods();

        // #5
        //methodChain();

        // #6
        //stringBuilderIntro();

        // #7
        //stringVsStringBuilderVsStringBufferComparison();

        // #8
        //stringBuilderReverse();
    }

    private static void stringEquals() {
        String s1 = "Hello World!";
        String s2 = new String("Hello World!");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private static void numberVsString() {
        System.out.println(1 + 2 + 3);
        System.out.println(1 + 2 + "3");

        String s3 = "1";
        s3 = s3 + 2;
        s3 += 3;
        System.out.println(s3);
    }

    private static void concatenation() {
        String s4 = "Hello";
        System.out.println(s4.concat(" World!"));
        System.out.println(s4);
    }

    private static void stringMethods() {
        String s5 = " Hello World! ";
        System.out.println(s5.length());
        System.out.println(s5.charAt(0));
        System.out.println(s5.indexOf("W"));
        System.out.println(s5.indexOf("o", 5));
        System.out.println(s5.substring(0, 5));
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.equals("Hello World!"));
        System.out.println(s5.equalsIgnoreCase("Hello World!"));
        System.out.println(s5.startsWith("Hello"));
        System.out.println(s5.endsWith("!"));
        System.out.println(s5.contains("World"));
        System.out.println(s5.replace("World", "Java"));
        System.out.println(s5.trim());
    }

    private static void methodChain() {
        String s6 = " A long time ago in a galaxy far, far away ";
        System.out.println(s6
            .trim()
            .replace("galaxy", "Poland")
            .toUpperCase()
        );
    }

    private static void stringBuilderIntro() {
        String s7 = "1";
        s7 = s7 + "2";
        System.out.println(s7);

        String s8 = "1";
        s8 = new StringBuilder(s8).append("2").toString();
        System.out.println(s8);
    }

    private static void stringVsStringBuilderVsStringBufferComparison() {
        long start1 = System.currentTimeMillis();
        String s9 = "1";
        for (int i = 2; i < 50000; i++) {
            s9 += i;
        }
        System.out.println("Time s9: " + (System.currentTimeMillis() - start1));

        long start2 = System.currentTimeMillis();
        StringBuilder s10 = new StringBuilder("1");
        for (int i = 2; i < 50000; i++) {
            s10.append(i);
        }
        System.out.println("Time s10: " + (System.currentTimeMillis() - start2));

        System.out.println(s9.equals(s10.toString()));

        long start3 = System.currentTimeMillis();
        StringBuffer s11 = new StringBuffer("1");
        for (int i = 2; i < 50000; i++) {
            s11.append(i);
        }
        System.out.println("Time s11: " + (System.currentTimeMillis() - start3));

        System.out.println(s9.equals(s11.toString()));
    }

    private static void stringBuilderReverse() {
        StringBuilder s12 = new StringBuilder("123");
        System.out.println(s12.reverse().toString());
    }
}
