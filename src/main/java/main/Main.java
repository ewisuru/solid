package main;

import api.Adder;
import api.NumberFilter;
import api.Validator;
import application.Calculator;
import impl.NegativeNumberValidator;
import impl.IntAdder;
import impl.ThousandValueFilter;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] numbers = Stream.of(args).mapToInt(Integer::valueOf).toArray();
        performAddition(numbers);
    }

    private static void performAddition(int[] numbers) {
        Adder adder = new IntAdder();
        Calculator cal = new Calculator(adder);

        Validator validator = new NegativeNumberValidator();
        NumberFilter filter = new ThousandValueFilter();
        int sum = cal.add(numbers, validator, filter);
        System.out.println("Sum: " + sum);
    }
}
