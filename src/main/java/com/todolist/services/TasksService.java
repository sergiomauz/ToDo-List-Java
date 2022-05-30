package com.todolist.services;

import java.util.ArrayList;
import java.util.UUID;
import com.todolist.models.Task;
import com.todolist.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksService {
    @Autowired
    TasksRepository tasksRepository;

    public ArrayList<Task> getTasks(){
        return (ArrayList<Task>) tasksRepository.findAll();
    }

    public Task getTask(UUID id){
        return tasksRepository.findById(id).get();
    }

    public Task createTask(Task task){
        return tasksRepository.save(task);
    }

    public Task updateTask(Task task){
        Task taskFromBD = tasksRepository.findById(task.getId()).get();
        if (task.getName() != null) {
            taskFromBD.setName(task.getName());
        }        
        if (task.getDescription() != null) {
            taskFromBD.setDescription(task.getDescription());
        }
        if (task.getGrade() != null) {
            taskFromBD.setGrade(task.getGrade());
        }
        if (task.getPriority() != null) {
            taskFromBD.setPriority(task.getPriority());
        }       
        
        return tasksRepository.save(taskFromBD);
    }

    public void deleteTask(UUID id){
        tasksRepository.deleteById(id);
    }
}
