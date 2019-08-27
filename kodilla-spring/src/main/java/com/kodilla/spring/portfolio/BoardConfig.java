package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.IfDayIsOddCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("ToDoTaskList")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(getToDoTaskList(),getInProgressList(),getDoneTaskList());
    }

    @Bean(name = "ToDoTaskList")
    @Scope("prototype")
    public TaskList getToDoTaskList() {
        return new TaskList ();
    }

    @Bean(name = "DoneTaskList")
    @Scope("prototype")
    public TaskList getDoneTaskList() {
        return new TaskList();
    }

    @Bean(name = "InProgressTaskList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

}
