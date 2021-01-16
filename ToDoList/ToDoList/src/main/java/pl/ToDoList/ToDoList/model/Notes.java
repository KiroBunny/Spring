package pl.ToDoList.ToDoList.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Notes {
    @Id
    private int id;
    private String note;
}
