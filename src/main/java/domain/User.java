package domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    Number number;
    public User(){

    }

    public void start(List<Integer> number){
        setNumber(number);
    }

    public void setNumber(List<Integer> number){
        this.number = new Number(number);
    }
    public List<Integer> getNumber(){
        return number.number;
    }
}
