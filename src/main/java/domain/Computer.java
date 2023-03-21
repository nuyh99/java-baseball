package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer{
    public static final int START_INCLUSIVE = 1;
    public static final int END_INCLUSIVE = 9;
    public static final int NUMBER_SIZE = 3;
    private Number number;

    public Computer(){
    }

    public void createNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        number = new Number(computer);
    }

    public List<Integer> getnumber() {
        return number.number;
    }

}

