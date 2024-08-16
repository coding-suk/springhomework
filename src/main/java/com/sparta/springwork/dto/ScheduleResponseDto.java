package com.sparta.springwork.dto;

import com.sparta.springwork.entity.Schedule;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String content;
    private String managename;
    private String password;
    private Timestamp create_dt; // 손봐야 할수도 있음
    private Timestamp modify_dt;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.content = schedule.getContent();
        this.managename = schedule.getManagename();
        this.password = schedule.getPassword();
        this.create_dt = schedule.getCreate_dt();
        this.modify_dt = schedule.getModify_dt();
    }
}
