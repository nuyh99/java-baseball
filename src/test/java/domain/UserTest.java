package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("User는")
public class UserTest {

    public static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    @DisplayName("세자리 수가 아닐 때 에러를 발생시킨다.")
    void userTest1() {
        //given
        User user = new User();
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4));

        //when

        //then
        assertThatThrownBy(() -> user.setNumber(test))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("각 자리 수가 1 - 9 사이의 수가 아닐 때 에러를 발생시킨다.")
    void userTest2() {
        //given
        User user = new User();
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,0,3));

        //when

        //then
        assertThatThrownBy(() -> user.setNumber(test))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(ERROR_MESSAGE);
    }



}
