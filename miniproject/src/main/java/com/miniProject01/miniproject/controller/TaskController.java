package com.miniProject01.miniproject.controller;

import com.miniProject01.miniproject.model.Task;
import com.miniProject01.miniproject.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class TaskController {

    @Autowired
    private TaskRepo taskRepo;

    @PostMapping("/addTask")
    public String addTask(@RequestBody Task task){
        taskRepo.save(task);
        return "Task Added";
    }
    @GetMapping("/getAllTask")
    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }

    @GetMapping("/findTask/{taskName}")
    public List<Map<String, Object>> findByTask(@PathVariable String taskName){
        return taskRepo.findByTaskName(taskName);
    }


    @PutMapping("/updateTask/{id}")
    public Task updateTask(@PathVariable Integer id , @RequestBody Task task ){
        Optional<Task> t =taskRepo.findById(id);

            t.get().setTaskName(task.getTaskName());
            t.get().setTaskInfo(task.getTaskInfo());
            t.get().setDate(task.getDate());
            return taskRepo.save(t.get());

    }

    @PutMapping("deleteTask/{id}")
    public String deleteTask(@PathVariable Integer id){
       taskRepo.deleteById(id);
        return "Task deleted successfully...!";
    }


}
