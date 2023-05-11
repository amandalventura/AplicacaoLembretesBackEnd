package com.example.ToDoApplication.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class TaskResponse {

    private Date date;

    private List<InfoTask> tasks;

}
