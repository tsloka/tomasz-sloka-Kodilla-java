package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
interface TaskListDao extends CrudRepository<TaskList, Integer> {
    TaskList findByListName(String listName);
    void deleteTaskListByListName(String listName);
}
