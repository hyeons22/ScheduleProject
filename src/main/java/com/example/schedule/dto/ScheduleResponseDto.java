package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
public class ScheduleResponseDto {

    private Long id;
    private String name;
    private String password;
    private String title;
    private String contents;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.title = schedule.getTitle();
        this.contents = schedule.getContents();
        this.createdDate = schedule.getCreatedDate();
        this.modifiedDate = schedule.getModifiedDate();
    }

    public ScheduleResponseDto(Long id,String name, String title, String contents, LocalDateTime createdDate, LocalDateTime modifiedDate){
        this.id = id;
        this.name = name;
        this.title = title;
        this.contents = contents;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
