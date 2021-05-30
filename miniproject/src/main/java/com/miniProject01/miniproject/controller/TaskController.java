package com.miniProject01.miniproject.controller;

import com.miniProject01.miniproject.model.Task;
import com.miniProject01.miniproject.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskRepo taskRepo;

    @PostMapping("/addTask")
    public String addTask(@RequestBody Task task){
        taskRepo.save(task);
        return "Task Added";
    }
}
