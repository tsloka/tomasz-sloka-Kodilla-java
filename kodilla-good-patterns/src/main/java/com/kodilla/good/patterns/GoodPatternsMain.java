package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        StringBuilder stringBuilder = new StringBuilder();
        movieStore.getMovies().entrySet().stream().flatMap(entry -> entry.getValue().stream())
                .forEach(s -> stringBuilder.append(s + " ! "));
        System.out.println(stringBuilder);
    }
}
