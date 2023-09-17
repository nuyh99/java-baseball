package baseball;

public class Count {
    private final Random random;
    String sampleNumber = "";
    int ballCount = 0;
    int strikeCount = 0;
    int check;

    public Count(Random random) {
        this.random = random;
    }

    public void check() {
        this.ballCount = 0;
        this.strikeCount = 0;

        for(int i = 0; i < this.random.realNumber.length(); ++i) {
            this.count(i);
        }

    }

    public void count(int i) {
        if (this.random.realNumber.contains(Character.toString(this.sampleNumber.charAt(i)))) {
            if (this.sampleNumber.charAt(i) == this.random.realNumber.charAt(i)) {
                ++this.strikeCount;
            } else if (this.isBall2(i)) {
                ++this.ballCount;
            }
        }

    }

    public boolean isBall2(int j) {
        this.check = 1;

        for(int i = 0; i < this.random.realNumber.length(); ++i) {
            if (!this.isBall1(i, j)) {
                return false;
            }

            this.isBall1(i, j);
        }

        if (this.check == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBall1(int i, int j) {
        if (this.sampleNumber.charAt(j) == this.random.realNumber.charAt(i)) {
            if (this.sampleNumber.charAt(i) == this.random.realNumber.charAt(i)) {
                return false;
            }

            this.check = 0;
        } else {
            this.check = 0;
        }

        return true;
    }
}
