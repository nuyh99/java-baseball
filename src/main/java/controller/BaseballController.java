package controller;

import static domain.Computer.NUMBER_SIZE;

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
        boolean gameFlag = true;
        while (gameFlag) {
            user = provideUserNumber(InputView.readUserNumber());
            List<Hint> result = computer.getHint(user.getNumber());
            Outputview.printHintList(result);

            if(isDone(user.getNumber(), result)){
            };
        }


    }

    private void gameset() {
        computer.createNumber();
    }

    private boolean isDone(List<Integer> usernumber, List<Hint> result) {
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
