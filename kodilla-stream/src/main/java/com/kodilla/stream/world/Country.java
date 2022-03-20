package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    public String country;
    public BigDecimal population;

    public String getCountry() {
        return country;
    }
    public BigDecimal getPopulation() {
        return population;
    }

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }
}
