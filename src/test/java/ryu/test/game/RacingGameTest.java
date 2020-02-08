package ryu.test.game;


import org.junit.Test;

public class RacingGameTest {

    @Test
    public void racingTest() {

        RacingGame racingGame = new RacingGame(3);
        racingGame.run(3);

    }
}