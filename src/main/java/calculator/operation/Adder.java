package calculator.operation;

import java.util.Arrays;

public class Adder {
    public int add(int[] inputArray) {
        return Arrays.stream(inputArray).sum();
    }
}
