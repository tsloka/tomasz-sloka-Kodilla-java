package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.selectTask(taskFactory.SHOPPING);
        boolean beforeExecution = shopping.isTaskExecuted();
        //Then
        Assert.assertEquals(false,beforeExecution);
        Assert.assertEquals(true, shopping.executeTask());
        Assert.assertEquals("Shopping", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task printing = taskFactory.selectTask(taskFactory.PAINTING);
        boolean beforeExecution = printing.isTaskExecuted();
        //Then
        Assert.assertEquals(false,beforeExecution);
        Assert.assertEquals(true, printing.executeTask());
        Assert.assertEquals("Painting", printing.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.selectTask(taskFactory.DRIVING);
        boolean beforeExecution = driving.isTaskExecuted();
        //Then
        Assert.assertEquals(false,beforeExecution);
        Assert.assertEquals(true, driving.executeTask());
        Assert.assertEquals("Driving", driving.getTaskName());
    }
}
