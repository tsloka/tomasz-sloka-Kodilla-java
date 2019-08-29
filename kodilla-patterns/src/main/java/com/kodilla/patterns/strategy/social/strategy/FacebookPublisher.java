package com.kodilla.patterns.strategy.social.strategy;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public void share() {
        System.out.println("This information was shared on Facebook.");
    }
}
