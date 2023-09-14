package com.example.todoplanner.todo.dto;

import com.example.todoplanner.todo.entity.ToDoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ToDoDTO {
    private String id;
    private String title;
    private boolean done;

    public ToDoDTO(final ToDoEntity entity) {
        this.id = id;
        this.title = title;
        this.done = done;
    }
}
