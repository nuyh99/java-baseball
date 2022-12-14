package baseball.exception;

public enum InputException {
    NOT_A_NUMBER("숫자를 입력해야 합니다."),
    INVALID_NUMBER_RANGE("1~9 숫자를 입력해야 합니다."),
    INVALID_NUMBER_LENGTH("3개의 숫자를 입력해야 합니다."),
    DUPLICATED_NUMBER("중복된 숫자를 입력했습니다.");

    private final String message;

    InputException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
