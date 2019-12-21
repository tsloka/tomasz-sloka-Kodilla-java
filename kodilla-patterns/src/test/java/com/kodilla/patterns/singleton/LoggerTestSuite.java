package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void createLog(){
        Logger.getInstance().log("Challenge accepted.");
    }


    @Test
    public void testGetLastLog(){
        //Given
        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Challenge accepted.",log);

    }
}
