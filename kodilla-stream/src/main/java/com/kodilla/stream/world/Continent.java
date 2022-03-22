package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class Continent {
    private List<Country> countries;
    private String continent;

    public Continent(List<Country> countries, String continent) {
        this.countries = countries;
        this.continent = continent;
    }

    public BigDecimal getContinentPopulation() {
        return countries.stream().map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
    public List<Country> getCountries() {
        return countries;
    }
    public String getContinent() {
        return continent;
    }
}
