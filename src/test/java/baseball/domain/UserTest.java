package baseball.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserTest {

    @ValueSource(strings = {"012d", "012", "2345", "122"})
    @ParameterizedTest
    void 유저_값_입력_검증(String input) throws Exception {
        //given
        User user = new User();

        //when

        //then
        assertThatThrownBy(() -> user.input(input)).isInstanceOf(IllegalArgumentException.class);
    }
}