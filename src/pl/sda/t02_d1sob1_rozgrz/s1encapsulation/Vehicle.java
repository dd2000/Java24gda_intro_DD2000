package pl.sda.t02_d1sob1_rozgrz.s1encapsulation;

public class Vehicle {
    // możliwe stany pojazdu
    private final int BROKEN = 0, STOPPED = 1, MOVING = 2;
    private int width;
    private int height;
    private int length;
    private int state;

    public Vehicle(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.state = STOPPED;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void start() {
        setState(MOVING);
    }

    public void stop() {
        setState(STOPPED);
    }

    public void repair() {
        if (state == MOVING) {
            System.out.println("Can't repair moving vehicle!");
        } else if (state != BROKEN) {
            System.out.println("The vehicle isn't broken!");
        } else {
            state = STOPPED;
        }
    }

    // prywatna metoda robocza wykorzystywane w metodach start() i stop()
    // nie jest możliwe arbitralne ustalenie stanu spoza klasy
    private void setState(int newState) {
        if (state == newState || state == BROKEN) {
            System.out.println("The state: " + state + " can't be changed to: " + newState);
        } else {
            state = newState;
        }
    }
}