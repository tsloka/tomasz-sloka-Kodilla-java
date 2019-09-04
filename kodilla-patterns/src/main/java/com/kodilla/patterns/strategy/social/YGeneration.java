package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.strategy.TwitterPublisher;

public class YGeneration extends User {
    protected String username;

    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
