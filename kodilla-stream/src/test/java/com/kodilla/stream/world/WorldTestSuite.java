package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country france = new Country("france", new BigDecimal("70000000"));
        Country spain = new Country("Spain", new BigDecimal("50000000"));
        List<Country> europe = new ArrayList<>();
        europe.add(germany);
        europe.add(spain);
        europe.add(france);
        Continent europeContinent = new Continent(europe, "Europe");

        europeContinent.getCountries().stream().map(Country::getPopulation);
        europeContinent.getContinentPopulation();

        Country china = new Country("China", new BigDecimal("1400000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));
        Country indonesia = new Country("Indonesia", new BigDecimal("300000000"));
        List<Country> asia = new ArrayList<>();
        asia.add(china);
        asia.add(indonesia);
        asia.add(india);
        Continent asiaContinent = new Continent(asia, "Asia");


        Country usa = new Country("Unated States", new BigDecimal("300000000"));
        Country canada = new Country("Canada", new BigDecimal("30000000"));
        Country mexico = new Country("Mexico", new BigDecimal("120000000"));
        List<Country> america = new ArrayList<>();
        america.add(usa);
        america.add(canada);
        america.add(mexico);
        Continent americaContinent = new Continent(america, "America");

        List<Continent> continents = new ArrayList<>();
        continents.add(europeContinent);
        continents.add(americaContinent);
        continents.add(asiaContinent);

        World world = new World(continents);
        BigDecimal getPeopleQuantityResult = world.getPeopleQuantity();

        BigDecimal worldPopulationQuantity = new BigDecimal("3650000000");
        assertEquals(worldPopulationQuantity, getPeopleQuantityResult);

    }
}
