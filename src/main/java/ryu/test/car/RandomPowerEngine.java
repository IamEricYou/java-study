package ryu.test.car;

import java.util.Random;

public class RandomPowerEngine implements Engine {

    @Override
    public int getPower() {
        return new Random().nextInt(10);
    }
}
