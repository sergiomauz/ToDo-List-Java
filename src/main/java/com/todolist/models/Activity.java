package com.todolist.models;

import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="activity")
public class Activity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(unique = true, nullable = false, length = 16)
    private UUID Id;

    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;

    private String Name;
    private String Description;
    private Boolean Status;
    private Short Hours;

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
    public Boolean getStatus() {
        return Status;
    }
    public void setStatus(Boolean status) {
        this.Status = status;
    }
    public Short getHours() {
        return Hours;
    }
    public void setHours(Short hours) {
        this.Hours = hours;
    }
    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }
}
