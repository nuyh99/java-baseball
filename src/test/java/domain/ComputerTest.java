package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Computer는")
public class ComputerTest {

    public static final int EXPECTED_NUMBER_SIZE = 3;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 9;

    @Test
    @DisplayName("세자리 수이며 각 자리수가 1 - 9 사이인 수를 생성한다")
    void ComputerTest1() {
        //given
        Computer computer = new Computer();

        //when
        computer.createNumber();

        //then
        assertThat(computer.getnumber().size()).isEqualTo(EXPECTED_NUMBER_SIZE);
        assertThat(computer.getnumber().stream()
            .filter(item -> item>= MIN_VALUE || item<=MAX_VALUE)
            .count()).isEqualTo(EXPECTED_NUMBER_SIZE);
    }


}
