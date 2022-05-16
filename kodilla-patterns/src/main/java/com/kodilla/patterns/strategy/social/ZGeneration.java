package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User{

    ZGeneration() {
        this.socialPublisher = new SnapchatPublisher();
    }
}
