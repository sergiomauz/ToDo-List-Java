package com.todolist.controllers;

import java.util.ArrayList;
import com.todolist.models.Activity;
import com.todolist.services.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("activities")
public class ActivitiesController {
    @Autowired
    ActivitiesService activitiesService;

    @GetMapping()
    public ArrayList<Activity> getActivities() {
        return activitiesService.getActivities();
    }

    @PostMapping()
    public Activity createActivity(@RequestBody Activity activity) {
        return activitiesService.createActivity(activity);
    }

    @PutMapping()
    public Activity updateActivity(@RequestBody Activity activity) {
        return activitiesService.updateActivity(activity);
    }
}
