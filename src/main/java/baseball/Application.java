package baseball;

import baseball.controller.BaseballController;
import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        BaseballController baseballController = initController();

        while (true) {
            baseballController.play();
            if (!baseballController.isWin())
                continue;

            if (!baseballController.retry())
                break;
        }
    }

    private static BaseballController initController() {
        BaseballController baseballController = new BaseballController(
                new InputView(),
                new OutputView(),
                initService()
        );

        baseballController.init();
        return baseballController;
    }

    private static BaseballService initService() {
        return new BaseballService(
                new Computer(),
                new User(),
                new Result()
        );
    }
}
