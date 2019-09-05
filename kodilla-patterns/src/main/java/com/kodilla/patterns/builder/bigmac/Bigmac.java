package com.kodilla.patterns.builder.bigmac;

import org.jetbrains.annotations.Contract;

import java.util.LinkedList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private Enum<Sauce> sauce;
    private List<Enum<Ingredients>> ingredients;

    private Bigmac(String bun, int burgers, Enum<Sauce> sauce, List<Enum<Ingredients>> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Enum<Sauce> getSauce() {
        return sauce;
    }

    public List<Enum<Ingredients>> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private String bun = "";
        private int burgers = 0;
        private Enum<Sauce> sauce = null;
        private List<Enum<Ingredients>> ingredients = new LinkedList<>();

        //public String

    }
}
