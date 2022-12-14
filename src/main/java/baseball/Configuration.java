package baseball;

import baseball.controller.BaseballController;
import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Configuration {
    public static BaseballController baseballController() {
        BaseballController baseballController = new BaseballController(
                new InputView(),
                new OutputView(),
                baseballService()
        );
        baseballController.init();

        return baseballController;
    }

    public static BaseballService baseballService() {
        return new BaseballService(
                new Computer(),
                new User(),
                new Result()
        );
    }
}
