package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String country;
    private BigDecimal population;

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }
    public BigDecimal getPopulation() {
        return population;
    }
}
