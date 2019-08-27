package impl;

import api.Adder;

import java.util.stream.IntStream;

public class IntAdder implements Adder {
    public int add(int[] numbers) {
        return IntStream.of(numbers).sum();
    }
}
