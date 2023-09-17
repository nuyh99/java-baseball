package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    BufferedReader bf;

    public Input() {
        this.bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public String inputThing() {
        String a = "";

        try {
            a = this.bf.readLine();
        } catch (IOException e) {
            System.err.println("입력 오류: " + e.getMessage());
        }

        return a;
    }
}
