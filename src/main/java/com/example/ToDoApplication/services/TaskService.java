package com.example.ToDoApplication.services;

import com.example.ToDoApplication.models.Task;
import com.example.ToDoApplication.models.TaskResponse;
import com.example.ToDoApplication.repositories.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
/*
    public List<Task> index() {

        return taskRepository.findAll();
    }*/

    // Map<Date, List<Task>>
    public List<TaskResponse> index() {
        List<Task> tasks = taskRepository.findAll();
        Map<Date, List<Task>> tasksByDate = tasks.stream().collect(Collectors.groupingBy(Task::getDate));
        List<TaskResponse> taskDates = tasksByDate.entrySet().stream().map(entry -> {
            TaskResponse taskDate = new TaskResponse();
            taskDate.setDate(entry.getKey());
            taskDate.setTasks(entry.getValue().stream().map(Task::toInfoTask).collect(Collectors.toList()));
            return taskDate;
        }).collect(Collectors.toList());
        Collections.sort(taskDates, Comparator.comparing(TaskResponse::getDate));
        return taskDates;
    }
    public Task create (Task task) {
        return taskRepository.save(task);
    }

    public ResponseEntity<Task> show(Long Id){
        return taskRepository.findById(Id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Task> update( Long id, Task task ) {
        return taskRepository.findById(id)
                .map( taskToUpdate -> {

                    taskToUpdate.setDescription(task.getDescription());
                    taskToUpdate.setDate(task.getDate());
                    taskToUpdate.setConcluded(task.getConcluded());

                    Task updated = taskRepository.save(taskToUpdate);

                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> delete (Long id) {
        return taskRepository.findById(id)
                .map(taskToDelete ->{
                    taskRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }


}
