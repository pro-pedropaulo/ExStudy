package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class DiseaseDTO {
    private Long idDisease;
    private String description;
    private Set<ChildDTO> children;
}