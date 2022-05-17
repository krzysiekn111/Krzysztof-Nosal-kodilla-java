package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private boolean bunWithSesameSeeds = false;
    private Integer burgers;
    private String sauce;
    private List<String> ingredients;

    public static class BigmacBuilder {

        private boolean bunWithSesameSeeds;
        private Integer burgers;
        private String sauce;
        private List<String> ingredients =  new ArrayList<>();

        public BigmacBuilder bunWithSesameSeeds(boolean bunWithSesameSeeds) {
            this.bunWithSesameSeeds = bunWithSesameSeeds;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String  ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac bigmacBuild() {
            return new Bigmac(bunWithSesameSeeds, burgers, sauce, ingredients);
        }


    }
    private Bigmac(boolean bunWithSesameSeeds, Integer burgers, String sauce, List<String> ingredients) {
        this.bunWithSesameSeeds = bunWithSesameSeeds;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }
    public boolean isBunWithSesameSeeds() {
        return bunWithSesameSeeds;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigmacBuilder{" +
                "bunWithSesameSeeds=" + bunWithSesameSeeds +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
