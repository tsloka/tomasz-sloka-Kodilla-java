package com.kodilla.hibernate.tasklist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column (name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column (name = "LIST_NAME")
    public String getListName() {
        return listName;
    }

    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskList taskList = (TaskList) o;

        if (id != taskList.id) return false;
        if (listName != null ? !listName.equals(taskList.listName) : taskList.listName != null) return false;
        return description != null ? description.equals(taskList.description) : taskList.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (listName != null ? listName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
