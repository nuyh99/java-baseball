package baseball;

public class CountException {
    public CountException() {
    }

    public void checkException(String number) {
        try {
            int a = Integer.parseInt(number);
        } catch (NumberFormatException var3) {
            throw new NumberFormatException("게임 종료");
        }

        if (number.length() > 3) {
            System.out.println("게임 종료");
            throw new IllegalArgumentException("게임 종료");
        }
    }
}
