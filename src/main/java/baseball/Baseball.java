package baseball;

public class Baseball {
    private final Count count;

    public Baseball(Count count) {
        this.count = count;
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void resultCheck() {
        if (this.count.ballCount > 0) {
            if (this.count.strikeCount > 0) {
                System.out.println(this.count.ballCount + "볼 " + this.count.strikeCount + "스트라이크");
            } else {
                System.out.println(this.count.ballCount + "볼");
            }
        } else if (this.count.strikeCount > 0) {
            System.out.println(this.count.strikeCount + "스트라이크");
        } else {
            System.out.println("낫싱");
        }

        count.sampleNumber = "";
    }

    public void program() {
        this.count.check();
        this.resultCheck();
    }
}
