package baseball;

public class CheckCount {
    public CheckCount() {
    }

    public boolean checkStrike(int i) {
        if (i == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        } else {
            return false;
        }
    }
}
