package com.example.university.rest.api.universitydata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long studentId;
    private String studentName;
    private Integer studentAge;
    private String studentEmail;
    private Integer studentContactNumber;
    private String studentFatherName;
    private String studentMotherName;
    private Integer studentFatherContactNumber;
    private Integer studentMotherContactNumber;
    private String studentAddress;
    private String bloodGroup;
}
