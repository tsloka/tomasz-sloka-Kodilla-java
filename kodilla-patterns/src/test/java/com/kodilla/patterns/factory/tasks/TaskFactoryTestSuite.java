package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.selectTask(TaskType.SHOPPING);
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
        Task printing = taskFactory.selectTask(TaskType.PAINTING);
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
        Task driving = taskFactory.selectTask(TaskType.DRIVING);
        boolean beforeExecution = driving.isTaskExecuted();
        //Then
        Assert.assertEquals(false,beforeExecution);
        Assert.assertEquals(true, driving.executeTask());
        Assert.assertEquals("Driving", driving.getTaskName());
    }
}
