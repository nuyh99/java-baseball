package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Integer> answer;

    public Computer() {
        this.answer = initAnswer();
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    private List<Integer> initAnswer() {
        List<Integer> result = new ArrayList<>();

        while (result.size() < 3) {
            int picked = Randoms.pickNumberInRange(1, 9);
            if (!result.contains(picked))
                result.add(picked);
        }

        return result;
    }
}
