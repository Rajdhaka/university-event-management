package com.geekster.universityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    @Pattern(regexp = "\\b[A-Z][a-z]*( [A-Z][a-z]*)*\\b")
    private String firstName;

    private String lastName;

    @Min(19)
    @Max(24)
    private Integer age;
    @Enumerated(EnumType.STRING)

    private Department department;


}
