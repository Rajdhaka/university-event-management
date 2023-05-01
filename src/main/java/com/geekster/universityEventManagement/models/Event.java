package com.geekster.universityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer eventId;

    private String eventName;

    private String locationOfEvent;

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;
}
