package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials();
        User zGeneration = new ZGeneration();
        User yGeneration = new YGeneration();

        //When
        //Then
        assertEquals("Twitter", millenials.sharePost());
        assertEquals("Snapchat", zGeneration.sharePost());
        assertEquals("Facebook", yGeneration.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials();
        User zGeneration = new ZGeneration();
        User yGeneration = new YGeneration();
        //When
        millenials.setSocialPublisher(new SnapchatPublisher());
        zGeneration.setSocialPublisher(new FacebookPublisher());
        yGeneration.setSocialPublisher(new TwitterPublisher());

        //Then
        assertEquals("Snapchat", millenials.sharePost());
        assertEquals("Facebook", zGeneration.sharePost());
        assertEquals("Twitter", yGeneration.sharePost());

    }
}
