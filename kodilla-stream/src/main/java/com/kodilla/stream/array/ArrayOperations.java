package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);
        return IntStream.range(0,numbers.length)
                .map(n->numbers[n])
                .average().orElse(0);
    }
    static double altAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}