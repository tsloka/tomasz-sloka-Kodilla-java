package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Testing empty list.");
        //Then
        Assert.assertEquals(numbers, testList.exterminate(numbers));
    }

    @Test
    public void TestOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator testList = new OddNumbersExterminator();
        //When
        List<Integer> numbers = new LinkedList<>();
        List<Integer> evenNumbers = new LinkedList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        evenNumbers.add(4);
        evenNumbers.add(10);
        System.out.println("Begining of normal list extermination.");
        //Then
        Assert.assertEquals(evenNumbers, testList.exterminate(numbers));
    }
}
