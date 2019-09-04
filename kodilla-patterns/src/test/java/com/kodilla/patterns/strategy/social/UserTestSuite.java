package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.strategy.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User zenek = new Millenials("Zenek");
        User janusz = new YGeneration("Janusz");
        User sebus = new ZGeneration("Sebus");

        //When
        String zenekShares = zenek.useShare();
        System.out.println("Zenek uses: " + zenekShares);
        String januszShares = janusz.useShare();
        System.out.println("Janusz uses: " + januszShares);
        String sebusShares = sebus.useShare();
        System.out.println("Sebus uses: " + sebusShares);

        //Then
        Assert.assertEquals("Facebook.",zenekShares);
        Assert.assertEquals("Snapchat.",sebusShares);
        Assert.assertEquals("Twitter.",januszShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sebus = new ZGeneration("Sebus");

        //When
        String sebusShares = sebus.useShare();
        System.out.println("Sebus uses: " + sebusShares);
        sebus.setSocialPublisher(new FacebookPublisher());
        sebusShares = sebus.useShare();
        System.out.println("Sebus now uses: " + sebusShares);

        //Then
        Assert.assertEquals("Facebook.", sebusShares);
    }
}