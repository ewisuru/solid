package main;

import calculator.operation.Adder;

import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        Adder adder = new Adder();
        // Negative validation
        Stream.of(args).mapToInt(Integer::valueOf).forEach(item -> {
            if(item < 0){
                throw new RuntimeException("Negatives not allowed");
            }
        });
        // Reduce thousands
        int[] newInputArray = Stream.of(args).mapToInt(Integer::valueOf).filter(item -> item < 1000).toArray();

        int sum = adder.add(newInputArray);
        System.out.println("Sum: " + sum);
    }
}
