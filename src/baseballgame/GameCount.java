package baseballgame;

public class GameCount extends GameMessage{
    private int strike;
    private int ball;

    public void resetCount(){ // 카운트 리셋
        this.strike = 0;
        this.ball = 0;
    }

    public void countStrike(int computerNumber, int userNumber){ // 스트라이크 숫자
        if(computerNumber == userNumber)
            strike++;
    }

    public void countBall(int computerNumber, int[] userNumber){ // 볼 숫자
        for(int i = 0; i<userNumber.length; i++){
            if(computerNumber == userNumber[i])
                ball++;
        }

    }

    public int Result(int ball, int strike){ // 결과
        if (ball == 0 && strike == 0) {
            System.out.println(NOT_ANSWER);
            return 0;
        } else if (strike == 3) {
            System.out.println(THREE_STRIKE);
            System.out.println(GAME_END);
            return 1;
        } else if (ball == 0 && strike != 0) {
            System.out.println(strike + STRIKE);
            return 0;
        } else if (ball != 0 && strike == 0) {
            System.out.println(ball + BALL);
            return 0;
        } else {
            System.out.println((ball-strike) + BALL + strike + STRIKE);
            return 0;
        }
    }

    public int BallCount(int[] computerNumber, int[] userNumber){ // 컴퓨터의 숫자와 사용자의 숫자 비교
        resetCount();

        for(int i = 0; i < computerNumber.length; i++){
            countStrike(computerNumber[i], userNumber[i]);
        }

        for(int i = 0; i< computerNumber.length;i++){
            countBall(computerNumber[i], userNumber);
        }

        return Result(ball, strike);
    }
}
