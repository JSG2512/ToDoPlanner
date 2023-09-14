package com.example.todoplanner.todo.controller;

import com.example.todoplanner.todo.dto.ResponseDTO;
import com.example.todoplanner.todo.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/test")
    public ResponseEntity<?> testTodo() {
        String str = toDoService.testService();
        List<String> list = new ArrayList<>();
        list.add(str);
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.ok().body(response);

    }


}
