package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class ChildDTO {
    private Long idChild;
    private String name;
    private LocalDate dateOfBirth;
    private String document;
    private char sexChild;
    private ClassroomDTO classroom;
    private ParentsDTO parents;
    private Set<AllergyDTO> allergies;
    private Set<DiseaseDTO> diseases;
    private Set<MonitorsDTO> monitors;
}