package baseball;

public class BaseballStadium {

    private final Referee referee;
    private final Computer computer;

    public BaseballStadium(Referee referee, Computer computer) {
        this.referee = referee;
        this.computer = computer;
    }

    public GameResult play(Balls balls) {
        return referee.compare(computer.getBalls(), balls);
    }

}
