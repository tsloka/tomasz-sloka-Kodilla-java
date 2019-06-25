package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String toDecorate, PoemDecorator poemDecorator) {
        System.out.println("Decorated text: " + poemDecorator.decorate(toDecorate));
    }
}
