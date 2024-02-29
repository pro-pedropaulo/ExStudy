package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class AllergyDTO {
    private Long idAllergy;
    private String description;
    private Set<ChildDTO> children;
}