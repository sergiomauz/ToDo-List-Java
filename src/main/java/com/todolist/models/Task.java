package com.todolist.models;

import java.util.List;
import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="task")
public class Task {    
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )    
    @Column(unique = true, nullable = false, length = 16)
    private UUID Id;

    @OneToMany(cascade = CascadeType.ALL)    
    private List<Activity> ActivitiesList;

    private String Name;
    private String Description;
    private Short Priority;
    private Short Grade;
    
    // Relationships
    public List<Activity> getActivitiesList() {
        return ActivitiesList;
    }
    public void setActivitiesList(List<Activity> activitiesList) {
        this.ActivitiesList = activitiesList;
    }

    // Getters and Setters
    public UUID getId() {
        return this.Id;
    }
    public void setId(UUID id) {
        this.Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public Short getPriority() {
        return Priority;
    }
    public void setPriority(Short priority) {
        this.Priority = priority;
    }
    public Short getGrade() {
        return Grade;
    }
    public void setGrade(Short grade) {
        this.Grade = grade;
    }
}
