package pl.ToDoList.ToDoList.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ToDoList.ToDoList.model.Task;
import pl.ToDoList.ToDoList.service.TaskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTaskList(){
        return taskService.getTaskList();
    }

    @GetMapping("/tasks/{id}")
    public Task getSingleTask(@PathVariable int id){
        return  taskService.getSingleTask(id);
    }
}
