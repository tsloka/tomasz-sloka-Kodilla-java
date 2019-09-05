package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .chooseBun(Bun.SESAME_BUN)
                .selectIngredients(Ingredients.SHRIMPS)
                .numberOfBurgers(2)
                .selectIngredients(Ingredients.MUSHROOMS)
                .selectIngredients(Ingredients.CHEESE)
                .selectIngredients(Ingredients.CHEESE)
                .acceptOrder();
        System.out.println(bigmac);
        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4,numberOfIngredients);
        Assert.assertEquals(Bun.SESAME_BUN,bigmac.getBun());
        Assert.assertEquals(2,bigmac.getBurgers());
        Assert.assertNotEquals(Ingredients.ONION,bigmac.getIngredients().equals(Ingredients.ONION));
    }
}
