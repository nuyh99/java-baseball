package controller;

import static domain.Computer.NUMBER_SIZE;
import static domain.User.GAMEEND;
import static domain.User.GAMESTART;
import static javax.sound.midi.ShortMessage.START;

import domain.Computer;
import domain.Hint;
import domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import view.InputView;
import view.Outputview;

public class BaseballController {

    private User user;
    private Computer computer;

    public void run() {
        gameset();

        while (user.getStatus() == GAMESTART) {
            user = provideUserNumber(InputView.readUserNumber());
            List<Hint> result = computer.getHint(user.getNumber());
            Outputview.printHintList(result);

            if (isDone(result)) {
                Outputview.printSuccessMessage();
                user.setStatus(InputView.readToReStart());
                ReStart();
            }

        }

        Outputview.printEndMessage();

    }

    private void gameset() {
        user = new User();
        computer = new Computer();
    }

    private void ReStart() {
        if (user.getStatus() == GAMESTART) {
            gameset();
        }
    }

    private boolean isDone(List<Hint> result) {
        if (Collections.frequency(result, Hint.STRIKE) == NUMBER_SIZE) {
            return true;
        }
        return false;
    }

    private User provideUserNumber(String input) {
        User user = new User();
        Stream<String> strStream = Arrays.stream(input.split(""));
        List<Integer> userNumber = strStream.map(s -> Integer.parseInt(s))
            .collect(Collectors.toCollection(ArrayList::new));

        user.start(userNumber);
        return user;
    }

}
