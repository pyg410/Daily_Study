package baseball;

import baseball.model.BaseBallStadium;
import baseball.model.GameResult;
import baseball.view.BaseballGameConsole;
import java.util.Map;

public class BaseballGame {

    private BaseBallStadium baseBallStadium;
    private BaseballGameConsole baseballGameConsole;

    public BaseballGame(BaseBallStadium baseBallStadium, BaseballGameConsole baseballGameConsole) {
        this.baseBallStadium = baseBallStadium;
        this.baseballGameConsole = baseballGameConsole;
    }

    public void start() {
        baseballGameConsole.start();
    }

    public void end() {
        baseballGameConsole.inputEndNum();
    }

    public void play() {
        baseballGameConsole.inputBallsNums();


    }

    public void result() {
        baseballGameConsole.result();
    }

}
