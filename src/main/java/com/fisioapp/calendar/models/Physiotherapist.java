package com.fisioapp.calendar.models;

import java.util.List;

import lombok.Data;

@Data
public class Physiotherapist {
    private long id;
    private String name;
    private List<Appointment> appointments;
}