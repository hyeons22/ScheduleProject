package com.example.schedule.service;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import com.example.schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto dto) {

        // 요청 받은 데이터로 Schedule 객체 생성, ID는 없음
        Schedule schedule = new Schedule(dto.getName(), dto.getPassword(), dto.getTitle(), dto.getContents(), LocalDateTime.now(),LocalDateTime.now());

        //저장
        return scheduleRepository.saveSchedule(schedule);
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedules() {

        List<ScheduleResponseDto> allSchedules = scheduleRepository.findAllSchedules();

        return allSchedules;
    }

    @Override
    public ScheduleResponseDto findScheduleById(Long id) {

        Schedule schedule =  scheduleRepository.findScheduleByIdOrElseThrow(id);

        return new ScheduleResponseDto(schedule);
    }

    @Override
    public ScheduleResponseDto updateSchedule(Long id, String name, String password, String title, String contents) {


        return null;
    }
}
