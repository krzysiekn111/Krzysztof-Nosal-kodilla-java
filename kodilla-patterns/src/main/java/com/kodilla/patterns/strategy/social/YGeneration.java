package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {

    YGeneration() {
        this.socialPublisher = new FacebookPublisher();
    }
}
