package baseball.domain;

import baseball.exception.InputException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private List<Integer> input = new ArrayList<>();

    public List<Integer> getInput() {
        return input;
    }

    /**
     * 도메인 로직
     */

    public void input(String input) {
        this.input = validate(input);
    }

    private List<Integer> validate(String input) {
        List<Integer> result = validateNumeric(input);
        validateRange(result);
        validateNumberLength(result);
        validateDuplicated(result);

        return result;
    }

    private List<Integer> validateNumeric(String input) {
        try {
            Integer.parseInt(input);
            return input.chars()
                    .map(Character::getNumericValue)
                    .boxed()
                    .collect(Collectors.toList());
        } catch (NumberFormatException n) {
            throw new IllegalArgumentException(InputException.NOT_A_NUMBER.getMessage());
        }
    }

    private void validateRange(List<Integer> input) {
        long count = input.stream()
                .filter(o -> 1 <= o && o <= 9)
                .count();

        if (count != input.size())
            throw new IllegalArgumentException(InputException.INVALID_NUMBER_RANGE.getMessage());
    }

    private void validateNumberLength(List<Integer> input) {
        if (input.size() != 3)
            throw new IllegalArgumentException(InputException.INVALID_NUMBER_LENGTH.getMessage());
    }

    private void validateDuplicated(List<Integer> input) {
        long count = input.stream()
                .distinct()
                .count();

        if (count != input.size())
            throw new IllegalArgumentException(InputException.DUPLICATED_NUMBER.getMessage());
    }
}
