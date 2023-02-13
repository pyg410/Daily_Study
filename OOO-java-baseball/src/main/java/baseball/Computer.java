package baseball;

public class Computer {

    private final Balls balls;

    public Computer(Balls balls) {
        this.balls = balls;
    }

    public Balls getBalls() {
        return balls;
    }
}