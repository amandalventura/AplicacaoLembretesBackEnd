package com.example.ToDoApplication.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;


@Entity
@Table(name = "tasks")
@Setter
@Getter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Boolean concluded;

}
