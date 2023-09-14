package com.example.todoplanner.todo.repository;

import com.example.todoplanner.todo.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<ToDoEntity, String> {
}
