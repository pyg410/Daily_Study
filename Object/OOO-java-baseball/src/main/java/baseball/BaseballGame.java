package baseball;

import java.util.Map;

public class BaseballGame {

    private final BaseballGameConsole baseballGameConsole;
    private final BaseballStadium baseballStadium;


    public BaseballGame(BaseballGameConsole baseballGameConsole, BaseballStadium baseballStadium) {
        this.baseballGameConsole = baseballGameConsole;
        this.baseballStadium = baseballStadium;
    }

    public void startGame() {
        baseballGameConsole.startBaseballGame();
    }

    public GameResult playGame() {
        String inputBaseballs = baseballGameConsole.playBaseballGame();
        Balls balls = BallGenerator.generateBalls(inputBaseballs);
        return baseballStadium.play(balls);
    }

    public void resultGame(Map<BallCount, Long> count) {
        baseballGameConsole.resultBaseballGame(count);
    }

    public GameStatus endGame() {
        String inputEndStatus = baseballGameConsole.endBaseballGame();
        return GameStatus.of(inputEndStatus);
    }
}
