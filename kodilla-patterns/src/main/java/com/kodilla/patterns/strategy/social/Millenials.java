package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.strategy.FacebookPublisher;

public class Millenials extends User {
    private String username;

    public Millenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
