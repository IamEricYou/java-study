package ryu.test.game;

import ryu.test.car.Car;
import ryu.test.car.RandomPowerEngine;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> cars = new ArrayList<>();
    private final List<Integer> result = new ArrayList<>();

    public RacingGame(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car(new RandomPowerEngine()));
        }
    }

    public void run(int numberOfGames) {
        result.clear();
        for (int i = 0; i < numberOfGames; i++) {
            for (int j = 0; j < cars.size(); j++) {
                Car car = cars.get(j);
                car.moveForward();
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            int location = cars.get(i).getLocation();
            result.add(location);
        }
    }

    public List<Integer> getResult() {
        return result;
    }
}
