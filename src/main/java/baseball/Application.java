package baseball;

import baseball.controller.BaseballController;

public class Application {
    public static void main(String[] args) {
        BaseballController baseballController = Configuration.baseballController();

        while (true) {
            baseballController.play();
            if (!baseballController.isWin())
                continue;
            if (!baseballController.retry())
                break;
        }
    }
}
