package baseball.utils;

import baseball.model.Balls;
import baseball.utils.BallGenerator;

public class Computer {
    public static Balls getBalls() {
        return BallGenerator.randomBalls();
    }
}
