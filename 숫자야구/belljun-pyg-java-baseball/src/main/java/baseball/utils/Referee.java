package baseball.utils;


import baseball.model.Balls;
import baseball.model.GameResult;

public class Referee {
    public static GameResult compareBalls(Balls balls1, Balls balls2) {
        return new GameResult(balls1.compareBallResults(balls2));
    }
}
