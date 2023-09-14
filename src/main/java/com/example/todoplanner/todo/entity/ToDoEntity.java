package com.example.todoplanner.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class ToDoEntity {
    private String id; // 이 오브젝트의 아이디
    private String userId; // 이 오브젝트를 생성한 유저의 아이디
    private String title; // ToDo 타이틀
    private boolean done; // true - todo를 완료한 경우(checked)


}
