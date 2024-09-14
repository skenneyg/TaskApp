package com.task.SpringbootTask.repository;


import com.task.SpringbootTask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
