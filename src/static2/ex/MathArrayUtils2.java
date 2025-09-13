package static2.ex;

import java.util.Arrays;

public class MathArrayUtils2 {

    private MathArrayUtils2() {
        // private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        return Arrays.stream(values).sum();
    }

    public static double average(int[] values) {
        return Arrays.stream(values).average().getAsDouble();
    }

    public static int min(int[] values) {
        return Arrays.stream(values).min().getAsInt();
    }

    public static int max(int[] values) {
        return Arrays.stream(values).max().getAsInt();
    }
}
