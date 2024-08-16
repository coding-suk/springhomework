package com.sparta.springwork.controller;

import com.sparta.springwork.dto.ScheduleRequestDto;
import com.sparta.springwork.dto.ScheduleResponseDto;
import com.sparta.springwork.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    private final ScheduleService scheduleService;
    //jdbc 사용x
    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/schedule")
    public ScheduleResponseDto create(@RequestBody ScheduleRequestDto scheduleRequestDto) {

        return scheduleService.create(scheduleRequestDto);
    }

}
