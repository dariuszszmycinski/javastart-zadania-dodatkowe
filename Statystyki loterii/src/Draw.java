import java.util.Arrays;

public class Draw {
    private final int[] NUMBERS;
    private final int MEGA_BALL;

    public Draw(int[] NUMBERS, int MEGA_BALL) {
        this.NUMBERS = NUMBERS;
        this.MEGA_BALL = MEGA_BALL;
    }

    public int[] getNumbers() {
        return NUMBERS;
    }

    public int getMegaBall() {
        return MEGA_BALL;
    }

    @Override
    public String toString() {
        return "Draw{" +
                "NUMBERS=" + Arrays.toString(NUMBERS) +
                ", MEGA_BALL=" + MEGA_BALL +
                '}';
    }
}
