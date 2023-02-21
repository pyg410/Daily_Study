package baseball.model;

import baseball.utils.Computer;
import baseball.utils.Referee;

public class BaseBallStadium {

    public GameResult play(Balls balls) {
        return Referee.compareBalls(Computer.getBalls(), balls);
    }
}
