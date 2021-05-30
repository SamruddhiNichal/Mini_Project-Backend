package com.miniProject01.miniproject.repository;

import com.miniProject01.miniproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Integer> {
}
