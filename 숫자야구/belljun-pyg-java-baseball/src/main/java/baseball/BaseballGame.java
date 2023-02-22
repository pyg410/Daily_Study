package baseball;

import baseball.model.BaseBallStadium;
import baseball.model.GameResult;
import baseball.view.BaseballGameConsole;
import baseball.view.BaseballGameStatus;
import baseball.view.Converter;

import java.util.List;

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

    public BaseballGameStatus end() {
        return baseballGameConsole.inputEndNum();
    }

    public GameResult play() {
        List<Integer> inputBallsNums = baseballGameConsole.inputBallsNums();
        return baseBallStadium.play(Converter.toBalls(inputBallsNums));
    }

    public void result(GameResult gameResult) {
        String result = gameResult.getGameResult();
        baseballGameConsole.result(result); // 이부분 고쳐야됨
    }

}
