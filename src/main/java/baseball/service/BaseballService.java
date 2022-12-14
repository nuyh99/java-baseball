package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;

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
}
