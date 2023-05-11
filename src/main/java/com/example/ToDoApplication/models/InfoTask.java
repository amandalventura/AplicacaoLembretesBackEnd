package com.example.ToDoApplication.models;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class InfoTask {
    private Long id;

    private String description;

    private Boolean concluded;
}
