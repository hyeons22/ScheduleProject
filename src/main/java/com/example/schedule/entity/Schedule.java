package com.example.schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
public class Schedule {

    private Long id;
    private String name;
    private String password;
    private String title;
    private String contents;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Schedule(String name, String password){
        this.name = name;
        this.password = password;
    }

    public Schedule(String name, String password, String title, String contents, LocalDateTime createdDate,LocalDateTime modifiedDate){
        this.name = name;
        this.password = password;
        this.title = title;
        this.contents = contents;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public Schedule(Long id,String name, String title, String contents, LocalDateTime createdDate,LocalDateTime modifiedDate){
        this.id = id;
        this.name = name;
        this.title = title;
        this.contents = contents;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }


}
