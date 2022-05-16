package com.kodilla.patterns.strategy.social;

public class User {

    SocialPublisher socialPublisher;

    public String  sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
