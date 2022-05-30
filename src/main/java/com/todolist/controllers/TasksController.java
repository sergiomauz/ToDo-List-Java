package com.todolist.controllers;

import java.util.ArrayList;
import com.todolist.models.Task;
import com.todolist.services.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TasksController {
    @Autowired
    TasksService tasksService;

    @GetMapping()
    public ArrayList<Task> getTasks() {
        return tasksService.getTasks();
    }

    @PostMapping()
    public Task createTask(@RequestBody Task task) {
        return tasksService.createTask(task);
    }

    @PutMapping()
    public Task updateTask(@RequestBody Task task) {
        return tasksService.updateTask(task);
    }
}
