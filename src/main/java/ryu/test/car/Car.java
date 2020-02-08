package ryu.test.car;

public class Car {
    private static final int MOVE_THRESHOLD = 4;
    private int location;
    private Engine engine;

    public Car(Engine engine) {
        this.location = 0;
        this.engine = engine;
    }

    public boolean moveForward() {
        if (engine.getPower() < MOVE_THRESHOLD) {
            return false;
        }
        location++;
        return true;
    }

    public int getLocation() {
        return location;
    }
}
