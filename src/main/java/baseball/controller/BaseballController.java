package baseball.controller;

import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

public class BaseballController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BaseballService baseballService;

    public BaseballController(InputView inputView, OutputView outputView, BaseballService baseballService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.baseballService = baseballService;
    }

    public void init() {
        outputView.init();
    }

    public void play() {
        baseballService.input(inputView.readUserAnswer());
        baseballService.match();

        List<Integer> result = baseballService.getResult();
        outputView.printResult(result.get(0), result.get(1));
    }

    public boolean isWin() {
        if (!baseballService.isGameOver())
            return false;

        outputView.printWin();
        return true;
    }

    public boolean retry() {
        return baseballService.retry(inputView.readRetrySelection());
    }
}
