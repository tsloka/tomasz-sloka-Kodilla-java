package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {7,13,25,1,8,12};

        //When
        double average = 11;

        //Then
        Assert.assertEquals(average, ArrayOperations.getAverage(numbers),0.00001);
        Assert.assertEquals(average, ArrayOperations.altAverage(numbers),0.00001);
    }

    @Test
    public void testEmptyTable() {
        //Given
        int[] numbers = {};

        //When
        double average = 0;

        //Then
        Assert.assertEquals(average, ArrayOperations.getAverage(numbers),0.00001);
        Assert.assertEquals(average, ArrayOperations.altAverage(numbers),0.00001);
    }
}
