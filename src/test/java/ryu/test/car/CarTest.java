package ryu.test.car;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void carMovesWhenNumberOver4() {
        Car carWith3Power = new Car(new CustomPowerEngine(3));
        Car carWith4Power = new Car(new CustomPowerEngine(4));
        assertThat(carWith3Power.moveForward()).isFalse();
        assertThat(carWith4Power.moveForward()).isTrue();
    }
}