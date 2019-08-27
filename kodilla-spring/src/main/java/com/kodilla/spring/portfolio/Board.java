package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(final TaskList toDoList,final TaskList inProgressList,final TaskList doneList) {
        this.toDoList=toDoList;
        this.inProgressList=inProgressList;
        this.doneList=doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }
}
