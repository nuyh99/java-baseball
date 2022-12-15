package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    @Test
    void 모두_스트라이크() throws Exception {
        //given
        Computer computer = new Computer();
        User user = new User();
        Result result = new Result();

        //when
        String answer = computer.getAnswer().stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        user.input(answer);
        result.match(computer.getAnswer(), user.getInput());

        //then
        assertThat(result.getStrikes()).isEqualTo(3);
        assertThat(result.getBalls()).isEqualTo(0);
    }

    @Test
    void 볼1_스트라이크1() throws Exception {
        //given
        Result result = new Result();
        List<Integer> answer = List.of(1, 2, 3);
        List<Integer> user = List.of(1, 5, 2);

        //when
        result.match(answer, user);

        //then
        assertThat(result.getStrikes()).isEqualTo(1);
        assertThat(result.getBalls()).isEqualTo(1);
    }

    @Test
    void 게임_종료됨() throws Exception {
        //given
        Result result = new Result();
        List<Integer> answer = List.of(1, 2, 3);

        //when
        result.match(answer, answer);

        //then
        assertThat(result.isGameOver()).isTrue();
    }

    @Test
    void 게임_종료되지_않음() throws Exception {
        //given
        Result result = new Result();
        List<Integer> answer = List.of(1, 2, 3);
        List<Integer> notAnswer = List.of(1, 2, 5);

        //when
        result.match(answer, notAnswer);

        //then
        assertThat(result.isGameOver()).isFalse();
    }
}