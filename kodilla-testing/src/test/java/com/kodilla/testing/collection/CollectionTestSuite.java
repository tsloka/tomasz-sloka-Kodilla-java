package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Let the tests begin: ");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("System malfunction, but tests finished...");
    }

    @Before
    public void beforeTest() {
        System.out.println("Begining of test:");
    }

    @After
    public void afterTest() {
        System.out.println("End of test.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator testList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>(0);
        System.out.println("Testing empty list.");
        //Then
        Assert.assertEquals(numbers, testList.exterminate(numbers));
    }

    @Test
    public void TestOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testList = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>(5000);
        ArrayList<Integer> evenNumbers = new ArrayList<>(2500);
        for (int i = 0; i < 5000; i++) {
            numbers.add(i);
        }
        for (int j = 0; j < 2500; j++) {
            evenNumbers.add(2 * j);
        }
        System.out.println("Begining of normal list extermination.");
        //Then
        Assert.assertEquals(evenNumbers, testList.exterminate(numbers));
    }
}
