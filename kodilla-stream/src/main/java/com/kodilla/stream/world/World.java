package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    BigDecimal getPeopleQuantity() {
        return continents.stream().flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }

}
