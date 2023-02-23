package baseball;

public class InputValidator {

    public String validate(InputValidatePolicy inputValidatePolicy, String input) {
        return inputValidatePolicy.validate(input);
    }
}
