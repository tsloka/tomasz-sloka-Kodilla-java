package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> result = new ArrayList<>();

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OddNumbersExterminator that = (OddNumbersExterminator) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
