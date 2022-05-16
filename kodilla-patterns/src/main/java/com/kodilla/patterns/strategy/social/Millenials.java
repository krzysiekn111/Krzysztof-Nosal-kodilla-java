package com.kodilla.patterns.strategy.social;

public class Millenials extends User{

    Millenials() {
       this.socialPublisher = new TwitterPublisher();
    }
}
