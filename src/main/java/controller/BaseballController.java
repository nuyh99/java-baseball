package controller;

import domain.Computer;
import domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import view.InputView;

public class BaseballController {
    private User user;
    private Computer computer;
    public void run() {



        user = provideUserNumber(InputView.readUserNumber());
    }

    private void gameset(){
        computer.createNumber();
    }

    private User provideUserNumber(String input) {
        User user = new User();
        Stream<String> strStream = Arrays.stream(input.split(""));
        List<Integer> userNumber = strStream.map(s->Integer.parseInt(s))
            .collect(Collectors.toCollection(ArrayList::new));

        user.setNumber(userNumber);
        return user;
    }

}
