package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;
import baseball.exception.InputException;

public class BaseballService {
    private final Computer computer;
    private final User user;
    private final Result result;

    public BaseballService(Computer computer, User user, Result result) {
        this.computer = computer;
        this.user = user;
        this.result = result;
    }

    public void input(String input) {
        user.input(input);
    }

    public void match() {
        result.match(computer.getAnswer(), user.getInput());
    }

    public boolean isGameOver() {
        return result.isGameOver();
    }

    public boolean retry(String input) {
        return validateInput(input) == 1;
    }

    private int validateInput(String input) {
        if (input.length() != 1)
            throw new IllegalArgumentException(InputException.INVALID_NUMBER_LENGTH.getMessage());

        int selection = validateNumericValue(input);
        if (selection != 1 && selection != 2)
            throw new IllegalArgumentException(InputException.INVALID_RETRY_SELECTION.getMessage());

        return selection;
    }

    private int validateNumericValue(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(InputException.NOT_A_NUMBER.getMessage());
        }
    }
}
