package pl.sda._JAVA_gda24_intro.coinpo;

import pl.sda._JAVA_gda24_intro.coinpo.threelevel.MiddleClass;
import pl.sda._JAVA_gda24_intro.coinpo.threelevel.RootClass;
import pl.sda._JAVA_gda24_intro.coinpo.threelevel.SubClass;

public class ClassTester {
    public static void main(String[] args) {
        ClassTester tester = new ClassTester();
        tester.basic();
//        tester.threeLevelInheritance();
    }

    private void basic() {
        A a = new A();
        B b = new B();

        a.sayHello();
        b.sayHello();
        System.out.println("B calculates: " + b.calculate());
    }

    private void threeLevelInheritance() {
        RootClass rootClass = new RootClass();
        System.out.println("rootClass.sayHelloFromRoot() = " + rootClass.sayHelloFromRoot());
        System.out.println("rootClass.sayHello() = " + rootClass.sayHello());
        System.out.println("rootClass.getRootField() = " + rootClass.getRootField());
        System.out.println("rootClass.getField() = " + rootClass.getField());
        System.out.println("-----------------------------");

        MiddleClass middleClass = new MiddleClass();
        System.out.println("middleClass.sayHelloFromRoot() = " + middleClass.sayHelloFromRoot());
        System.out.println("middleClass.sayHelloFromMiddle() = " + middleClass.sayHelloFromMiddle());
        System.out.println("middleClass.sayHello() = " + middleClass.sayHello());
        System.out.println("middleClass.getRootField() = " + middleClass.getRootField());
        System.out.println("middleClass.getMiddleField() = " + middleClass.getMiddleField());
        System.out.println("middleClass.getField() = " + middleClass.getField());
        System.out.println("-----------------------------");

        SubClass subClass = new SubClass();
        System.out.println("subClass.sayHelloFromRoot() = " + subClass.sayHelloFromRoot());
        System.out.println("subClass.sayHello() = " + subClass.sayHello());
        System.out.println("subClass.getRootField() = " + subClass.getRootField());
        System.out.println("subClass.getField() = " + subClass.getField());
    }
}

class A {
    private int a1 = 1;
    protected int a2 = 2;

    public void sayHello() {
        System.out.println("Hello from A!");
    }

    protected int getSum() {
        return a1 + a2;
    }
}

class B extends A {
    private int b1 = 5;

    public void sayHello() {
        System.out.println("Hello from B!");
    }

    int calculate() {
//        return b1 + a1 + a2; // won't compile because of private a1
        return getSum() + b1;
    }
}