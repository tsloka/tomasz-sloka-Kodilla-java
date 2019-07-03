package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }

    public TaskList getSpecificTaskList(TaskList taskList) {
        return taskLists.get(taskLists.indexOf(taskList));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" + "\n" +
                "name='" + name + '\'' + ",\n" +
                "taskLists=" + taskLists + "\n" +
                '}';
    }

    public double averageTaskTime(List<TaskList> taskList) {
        return taskLists.stream()
                .filter(taskList::contains)
                .flatMap(t1 -> t1.getTasks().stream())
                .map(Task::getCreated)
                .mapToInt(d -> Period.between(d, LocalDate.now()).getDays())
                .average().orElse(0);
    }
}