package com.fisioapp.calendar.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Appointment {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Physiotherapist physiotherapist;
}