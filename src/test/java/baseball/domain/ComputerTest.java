package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {

    @Test
    void 컴퓨터의_서로_다른_숫자_3개_판별() throws Exception {
        //given
        Computer computer = new Computer();

        //when
        long count = computer.getAnswer().stream()
                .distinct()
                .count();

        //then
        assertThat(count).isEqualTo(3);
        assertThat(computer.getAnswer()).allMatch(o -> 1 <= o && o <= 9);
    }
}