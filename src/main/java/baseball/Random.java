package baseball;


import camp.nextstep.edu.missionutils.Randoms;

public class Random {
    public String realNumber = "";

    public Random() {
        this.realRandom();
    }

    public void realRandom() {
        for (int i = 0; this.realNumber.length() < 3; ++i) {
            int randomNumber1 = Randoms.pickNumberInRange(1, 9);
            if (!this.realNumber.contains(Integer.toString(randomNumber1))) {
                this.realNumber += Integer.toString(randomNumber1);
            }
        }

    }
}
