package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}