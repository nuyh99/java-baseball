package baseball;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        Count count = new Count(random);
        CheckCount checkCount = new CheckCount();
        CountException countException = new CountException();
        Baseball baseball = new Baseball(count);
        Input input = new Input();
        String go = null;

        while(true) {
            count.sampleNumber = input.inputThing();
            System.out.println(count.sampleNumber);
            countException.checkException(count.sampleNumber);
            baseball.program();
            if (checkCount.checkStrike(count.strikeCount)) {
                go = input.inputThing();
            }

            if (go != null && go.equals("1")) {
                random = new Random();
                count = new Count(random);
                baseball = new Baseball(count);
            }
            else if (go != null && go.equals("2")) {
                return;
            }
            else if (go != null) {
                System.out.println("잘못된 입력으로 게임이 자동 종료됩니다.");
                return;
            }
            go = null;
            }

        }
    }

