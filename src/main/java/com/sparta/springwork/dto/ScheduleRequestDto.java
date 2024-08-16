package com.sparta.springwork.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class ScheduleRequestDto {
    private Long id;
    private String content;
    private String managename;
    private String password;
    private Timestamp create_dt; // 손봐야 할수도 있음
    private Timestamp modify_dt;
}
