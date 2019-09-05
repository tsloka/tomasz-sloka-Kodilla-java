package com.kodilla.patterns.builder.bigmac;

import java.util.LinkedList;
import java.util.List;

public class Bigmac {
    private Bun bun;
    private int burgers;
    private Sauce sauce;
    private List<Ingredients> ingredients;

    private Bigmac(Bun bun, int burgers, Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        private Bun bun = null;
        private int burgers = 0;
        private Sauce sauce = null;
        private List<Ingredients> ingredients = new LinkedList<>();

        public BigmacBuilder chooseBun (Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder numberOfBurgers(int number) {
            this.burgers = number;
            return this;
        }

        public BigmacBuilder selectSauce (Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder selectIngredients (Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac acceptOrder() {
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
