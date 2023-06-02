package baseballgame;

import camp.nextstep.edu.missionutils.Console;
public class User extends GameMessage {

    public int[] UserNumber(){ // 사용자 숫자 생성
        System.out.println(INPUT_NUMBER);

        String input = readLine();

        String[] numberArr = input.split("");
        int[] userNumber = new int[3];

        for(int i = 0; i<3; i++){
            userNumber[i] = Integer.parseInt(numberArr[i]);
        }

        return userNumber;
    }

}
