package impl;

import api.NumberFilter;

import java.util.Arrays;

public class ThousandValueFilter  implements NumberFilter {
    @Override
    public int[] filter(int[] numbers) {
        return Arrays.stream(numbers).distinct().filter(input -> input < 1000).toArray();
    }
}
