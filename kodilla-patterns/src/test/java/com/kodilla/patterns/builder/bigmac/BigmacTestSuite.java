package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce("standard")
                .bunWithSesameSeeds(true)
                .burgers(3)
                .ingredients("cheese")
                .ingredients("shrimps")
                .ingredients("beckon")
                .bigmacBuild();
        System.out.println(bigmac);
        //When
        //then
        assertTrue(bigmac.isBunWithSesameSeeds());
        assertEquals(3, bigmac.getIngredients().size());
        assertEquals(3, bigmac.getBurgers());
        assertEquals("standard", bigmac.getSauce());
    }

}
