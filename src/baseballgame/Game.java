package baseballgame;

import static camp.nextstep.edu.missionutils.Console.readLine;
import baseballgame.GameCount;

public class Game extends GameMessage {
    private static int ChooseNumber(){ // 1, 2 입력
        String number = readLine();
        return Integer.parseInt(number);
    }

    GameCount gameCount = new GameCount();

    public boolean startGame(){
        System.out.println(RESTART_GAME);
        int num = ChooseNumber();
        if(num == 1){
            return true;
        }
        if(num == 2){
            System.out.println(GAME_EXIT);
            return false;
        }
        throw new IllegalArgumentException(); // 1, 2 말고 다른 숫자 입력했을 때
    }

    public void check(int[] computerNumber){
        User user = new User();

        while(true){
            int[] userNumber = user.UserNumber();
            if(gameCount.BallCount(computerNumber, userNumber)==1) // 3개 모두 맞췄을 때
                break;
        }
    }



}
