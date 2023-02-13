package baseball;

import java.util.List;

public class Referee {

    public GameResult compare(Balls p1, Balls p2) {
        List<CompareBallResultType> compareResult = p1.compareBalls(p2);
        return new GameResult(compareResult);
    }
}
