package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class Continent {
    List<Country> countries;
    public String continent;

    public List<Country> getCountries() {
        return countries;
    }
    public BigDecimal getContinentPopulation() {
        return countries.stream().map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }

    public String getContinent() {
        return continent;
    }

    public Continent(List<Country> countries, String continent) {
        this.countries = countries;
        this.continent = continent;
    }
}
