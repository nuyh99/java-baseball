package domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    Number number;
    public User(){

    }

    public void setNumber(List<Integer> number){
        this.number = new Number(number);
    }
}
