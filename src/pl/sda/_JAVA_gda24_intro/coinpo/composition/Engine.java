package pl.sda._JAVA_gda24_intro.coinpo.composition;

public class Engine {
    private boolean started = false;
    private int capacity;
    private EngineType engineType;

    public Engine(int capacity, EngineType engineType) {
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public boolean getStarted() {
        return started;
    }

    public void start() {
        started = true;
    }

    public int getCapacity() {
        return capacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "started=" + started +
                ", capacity=" + capacity +
                ", engineType=" + engineType +
                '}';
    }
}
