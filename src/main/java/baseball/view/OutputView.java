package baseball.view;

public class OutputView {
    public void init() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printResult(int strikes, int balls) {
        StringBuilder result = new StringBuilder();
        if (balls > 0)
            result.append(balls + "볼 ");
        if (strikes > 0)
            result.append(strikes + "스트라이크");
        if (result.length() == 0)
            System.out.print("낫싱");

        System.out.println(result);
    }

    public void printWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
