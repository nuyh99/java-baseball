package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballServiceTest {

    @ValueSource(strings = {"12", "3", "d"})
    @ParameterizedTest
    void 잘못된_재시작_값_검증(String input) throws Exception {
        //given
        BaseballService baseballService = new BaseballService(new Computer(), new User(), new Result());

        //when

        //then
        assertThatThrownBy(() -> baseballService.retry(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 재시작() throws Exception {
        //given
        BaseballService baseballService = new BaseballService(new Computer(), new User(), new Result());

        //when

        //then
        assertThat(baseballService.retry("1")).isTrue();
    }
}