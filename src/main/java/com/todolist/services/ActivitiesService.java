package com.todolist.services;

import java.util.ArrayList;
import java.util.UUID;
import com.todolist.models.Activity;
import com.todolist.repositories.ActivitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiesService {
    @Autowired
    ActivitiesRepository activitiesRepository;

    public ArrayList<Activity> getActivities(){
        return (ArrayList<Activity>) activitiesRepository.findAll();
    }

    public Activity getActivity(UUID id){
        return activitiesRepository.findById(id).get();
    }

    public Activity createActivity(Activity activity){
        return activitiesRepository.save(activity);
    }

    public Activity updateActivity(Activity activity){
        Activity activityFromBD = activitiesRepository.findById(activity.getId()).get();
        if (activity.getName() != null) {
            activityFromBD.setName(activity.getName());
        }        
        if (activity.getDescription() != null) {
            activityFromBD.setDescription(activity.getDescription());
        }
        if (activity.getStatus() != null) {
            activityFromBD.setStatus(activity.getStatus());
        }
        if (activity.getHours() != null) {
            activityFromBD.setHours(activity.getHours());
        }       
        if (activity.getTask() != null) {
            activityFromBD.setTask(activity.getTask());
        }    

        return activitiesRepository.save(activityFromBD);
    }

    public void deleteActivity(UUID id){
        activitiesRepository.deleteById(id);
    }
}
