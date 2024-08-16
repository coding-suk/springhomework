package com.sparta.springwork.service;

import com.sparta.springwork.dto.ScheduleRequestDto;
import com.sparta.springwork.dto.ScheduleResponseDto;
import com.sparta.springwork.entity.Schedule;
import com.sparta.springwork.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public ScheduleResponseDto create(ScheduleRequestDto scheduleRequestDto) {

        return new ScheduleResponseDto(scheduleRepository.create(new Schedule(scheduleRequestDto)));
    }
}
