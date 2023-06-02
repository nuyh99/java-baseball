package baseballgame;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    public int[] createRandomNumberComputer() { // 랜덤한 숫자 생성하는 메소드

        List<Integer> number = new ArrayList<>();
        while (number.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!number.contains(randomNumber)) {
                number.add(randomNumber);
            }
        }

        int[] computerNumber = new int[number.size()];
        for (int i = 0; i < number.size(); i++) {
            computerNumber[i] = number.get(i);
        }


        return computerNumber;
    }
}
