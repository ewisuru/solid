package application;

import api.Adder;
import api.NumberFilter;
import api.Validator;

import java.util.Arrays;

public class Calculator {
    Adder adder;

    public Calculator(Adder adder) {
        this.adder = adder;
    }

    public int add(int[] numbers, Validator validator, NumberFilter numberFilter){
        Arrays.stream(numbers).forEach(number -> validator.validate(number));
        return add(numbers, numberFilter);
    }

    public int add(int[] numbers, NumberFilter numberFilter) {
        int[] filteredNumbers = numberFilter.filter(numbers);
        return add(filteredNumbers);
    }

    public int add(int[] numbers){
        return adder.add(numbers);
    }
}
