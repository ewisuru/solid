package impl;

import api.Validator;

public class NegativeNumberValidator implements Validator {
    @Override
    public void validate(int input) {
        if(input < 0){
            throw new RuntimeException("Negative not allowed");
        }
    }
}
