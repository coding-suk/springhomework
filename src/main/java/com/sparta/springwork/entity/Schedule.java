package com.sparta.springwork.entity;

import com.sparta.springwork.dto.ScheduleRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class Schedule {
    private Long id;
    private String content;
    private String managename;
    private String password;
    private Timestamp create_dt;
    private Timestamp modify_dt;

    public Schedule(ScheduleRequestDto scheduleRequestDto) {
        this.id = scheduleRequestDto.getId();
        this.content = scheduleRequestDto.getContent();
        this.managename = scheduleRequestDto.getManagename();
        this.password = scheduleRequestDto.getPassword();
        this.create_dt = scheduleRequestDto.getCreate_dt();
        this.modify_dt = scheduleRequestDto.getModify_dt();

    }
}
