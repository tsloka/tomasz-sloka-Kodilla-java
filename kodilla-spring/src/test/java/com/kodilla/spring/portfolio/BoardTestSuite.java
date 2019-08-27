package com.kodilla.spring.portfolio;

import com.kodilla.spring.SpringRunnerS;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRunnerS.class)
public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("Take the dog on a walk.");
        board.getInProgressList().addTask("Clean the apartment.");
        board.getToDoList().addTask("Finish this task.");

        //Then
        Assert.assertEquals("Take the dog on a walk.",board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Clean the apartment.",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Finish this task.",board.getToDoList().getTasks().get(0));

    }

}
