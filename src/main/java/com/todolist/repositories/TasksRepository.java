package com.todolist.repositories;

import java.util.UUID;
import com.todolist.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends CrudRepository<Task, UUID> {    
    
}
