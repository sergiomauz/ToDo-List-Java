package com.todolist.repositories;

import java.util.UUID;
import com.todolist.models.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepository extends CrudRepository<Activity, UUID> {
    
}
