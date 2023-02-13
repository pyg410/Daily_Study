package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.Map;

public class BaseballGameConsole {

    private final Host host;

    private final InputValidator inputValidator;


    public BaseballGameConsole(Host host, InputValidator inputValidator) {
        this.host = host;
        this.inputValidator = inputValidator;
    }

    public void startBaseballGame() {
        host.speak(new StartLine());
    }

    public String playBaseballGame() {
        host.speak(new ProgressLine());
        return inputValidator.validate(new InputProgressValidatePolicy(), Console.readLine());
    }

    public void resultBaseballGame(Map<BallCount, Long> count) {
        host.speak(new ResultLine(count));
    }

    public String endBaseballGame() {
        host.speak(new EndLine());
        return inputValidator.validate(new InputEndValidatePolicy(), Console.readLine());
    }
}

