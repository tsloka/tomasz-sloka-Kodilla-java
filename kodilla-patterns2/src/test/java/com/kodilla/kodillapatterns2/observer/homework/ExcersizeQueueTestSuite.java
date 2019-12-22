package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class ExcersizeQueueTestSuite {

    @Test
    public void testQueueSystem() {
        //Given
        Excersize test1 = new Excersize("test", "solution");
        Excersize test2 = new Excersize("test", "solution");
        Excersize test3 = new Excersize("test", "solution");
        Excersize test4 = new Excersize("test", "solution");
        Excersize test5 = new Excersize("test", "solution");
        Excersize test6 = new Excersize("test", "solution");
        ExcersizeQueue waltherWhite = new ExcersizeQueue("Walther White");
        ExcersizeQueue jessiePinkman = new ExcersizeQueue("Jessie Pinkman");
        ExcersizeQueue hankSchrader = new ExcersizeQueue("Hank Schrader");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        //When
        waltherWhite.registerMentor(mentor1);
        jessiePinkman.registerMentor(mentor1);
        hankSchrader.registerMentor(mentor2);
        waltherWhite.addExcersize(test1);
        jessiePinkman.addExcersize(test2);
        hankSchrader.addExcersize(test3);
        waltherWhite.addExcersize(test4);
        jessiePinkman.addExcersize(test5);
        hankSchrader.addExcersize(test6);
        //Then
        Assert.assertEquals(4, mentor1.getUpdates());
        Assert.assertEquals(2, mentor2.getUpdates());
    }
}
