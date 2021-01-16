package pl.ToDoList.ToDoList.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ToDoList.ToDoList.model.Task;
import pl.ToDoList.ToDoList.repository.TaskRepository;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getTaskList(){
        return taskRepository.findAll();
    }

    public Task getSingleTask(int id) {
        return taskRepository.findById(id).orElseThrow();

    }
}
