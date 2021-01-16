package pl.ToDoList.ToDoList.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ToDoList.ToDoList.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
