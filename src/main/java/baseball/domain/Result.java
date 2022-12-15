package baseball.domain;

import java.util.List;

public class Result {
    private int strikes;
    private int balls;

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    /**
     * 도메인 로직
     */
    public void match(List<Integer> computer, List<Integer> user) {
        strikes = matchStrikes(computer, user);
        balls = matchAnys(computer, user) - strikes;
    }

    public boolean isGameOver() {
        return strikes == 3;
    }

    private int matchStrikes(List<Integer> computer, List<Integer> user) {
        int result = 0;

        for (int i = 0; i < 3; i++)
            if (computer.get(i).equals(user.get(i)))
                result++;

        return result;
    }

    private int matchAnys(List<Integer> computer, List<Integer> user) {
        int result = 0;

        for (int userInput : user)
            if (computer.contains(userInput))
                result++;

        return result;
    }
}
