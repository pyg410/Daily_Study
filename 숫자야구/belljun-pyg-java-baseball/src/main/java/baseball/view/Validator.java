package baseball.view;

import baseball.view.utils.input.InputBallsPolicy;
import baseball.view.utils.input.InputEndPolicy;

public class Validator {
    private InputValidator inputValidator;

    public Validator(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public String validateInputBallsNums(String ballsNums) {
        return inputValidator.validateInput(ballsNums, new InputBallsPolicy());
    }

    public String validateInputEndNum(String endNum) {
        return inputValidator.validateInput(endNum, new InputEndPolicy());
    }
}
