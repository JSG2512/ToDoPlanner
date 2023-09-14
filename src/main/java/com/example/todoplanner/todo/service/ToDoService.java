package com.example.todoplanner.todo.service;


import com.example.todoplanner.todo.entity.ToDoEntity;
import com.example.todoplanner.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ToDoService {

    @Autowired
    private TodoRepository repository;

    public String testService() {
        // TodoEntity 생성
        ToDoEntity entity = ToDoEntity.builder().title("My first todo item").build();
        // TodoEntity 저장
        repository.save(entity);
        // TodoEntity 검색
        ToDoEntity savedEntity = repository.findById(entity.getId()).get();
        return savedEntity.getTitle();
    }

    public List<ToDoEntity> create(final ToDoEntity entity) {
        //Validations
        validate(entity);

        repository.save(entity);

        log.info("Entity Id : {} is saved.", entity.getId());

        return repository.findByUserId(entity.getUserId());

    }

    // 리팩토링한 메서드
    private void validate(final ToDoEntity entity) {
        if (entity == null) {
            log.warn("Entity cannot be null.");
            throw new RuntimeException("Entity cannot be null.");
        }

        if (entity.getUserId() == null) {
            log.warn("Unknown user.");
            throw new RuntimeException("Unknown user.");
        }
    }

}
