package ryu.test.car;

public class CustomPowerEngine implements Engine {

    private int power;

    public CustomPowerEngine(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }
}
