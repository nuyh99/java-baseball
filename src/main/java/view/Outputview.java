package view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static domain.Computer.NUMBER_SIZE;

import domain.Hint;
import java.util.Collections;
import java.util.List;

public class Outputview {

    private Outputview() {
    }

    public static void printHintList(List<Hint> hintList) {
        String result ="";
        String resultStrike="";
        String resultBall="";
        Integer StrikeCount=Collections.frequency(hintList,Hint.STRIKE);
        Integer BallCount=Collections.frequency(hintList,Hint.BALL);

        if(StrikeCount!=0){
            resultStrike = StrikeCount.toString()+Hint.STRIKE.getInKorean();
        }
        if(BallCount!=0){
            resultBall = BallCount.toString()+Hint.BALL.getInKorean();
        }
        if(BallCount==0&&StrikeCount==0){
            result+=Hint.NOTHING.getInKorean();
        }
        result+=resultBall+resultStrike;
        System.out.println(result);
    }
}
