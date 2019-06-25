package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.refrence.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Wilkommen ins siebte modul - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("challenge accepted", String::toUpperCase);
        poemBeautifier.beautify("Challenge AccePted", String::toLowerCase);
        poemBeautifier.beautify("Challenge Accepted", (toDecorate -> "ABC"+toDecorate+"ABC"));
        poemBeautifier.beautify("Challenge Accepted", (toDecorate -> toDecorate.concat("DOWN")));
        poemBeautifier.beautify("Challenge Accepted", (toDecorate -> toDecorate.substring(2,5)));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
